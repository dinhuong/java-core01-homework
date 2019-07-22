/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Homework5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //bai1
        System.out.print("nhap ngay: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(checkvalidDay(d, m, y));
        //bai2
        System.out.print("nhap gio: ");
        int currenttime = sc.nextInt();
        System.out.print("cong them so giay la: ");
        int t = sc.nextInt();
        int n = nexttime(currenttime, t);
        if (n == 0) {
            System.out.println("000000");
        } else {
            if (n < 100000) {
                System.out.print(0);
            }
            System.out.println(n);
        }
        //bai3
        System.out.print("nhap ngay 1: ");
        String day1 = sc.nextLine();
        System.out.println("nhap ngay 2: ");
        String day2 = sc.nextLine();
        System.out.print(subday(day1, day2));

    }

    static boolean checkvalidDay(int day, int month, int year) {
        boolean k = false;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (0 < day && day < 32) {
                    k = true;
                }
                break;
            case 2:
                if (year % 4 == 0) {
                    if (0 < day && day < 30) {
                        k = true;
                    }
                } else {
                    if (0 < day && day < 29) {
                        k = true;
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (0 < day && day < 31) {
                    k = true;
                }
                break;
            default:
                k = false;
        }
        return k;
    }

    static int nexttime(int current, int t) {
        int d = 0;
        int s = current % 100 + t;
        current = current / 100;
        int m = current % 100;
        int h = current / 100;
        if (s > 59) {
            d = s / 60;
            s = s % 60;
            m = m + d;
            if (m > 59) {
                d = m / 60;
                m = m % 60;
                h = h + d;
                if (h > 23) {
                    h = h % 24;
                }
            }
        }
        return h * 10000 + m * 100 + s;
    }

    static int subday(String day1, String day2) {
        String[] dau = day1.split("-");
        String[] cuoi = day2.split("-");
        int y1 = Integer.parseInt(dau[0]);
        int d1 = Integer.parseInt(dau[1]) * 100 + Integer.parseInt(dau[2]);
        int y2 = Integer.parseInt(cuoi[0]);
        int d2 = Integer.parseInt(cuoi[1]) * 100 + Integer.parseInt(cuoi[2]);
        int day = 1;
        int month = 1;
        int j = 0;
        int k = 0;
        for (int i = 1; i < 365; i++) {
            if (d1 == month * 100 + day) {
                j = i;
            }
            if (d2 == month * 100 + day) {
                k = i;
            }
            if (j != 0 && k != 0) {
                break;
            }
            day++;
            if (day >= 28) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (day > 31) {
                            month++;
                            day = 1;
                        }
                        break;
                    case 2:
                        if (day > 28) {
                            month++;
                            day = 1;
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (day > 30) {
                            month++;
                            day = 1;
                        }
                        break;
                }
            }
        }
        return 365 * (y2 - y1) + (k - j);
    }
}
