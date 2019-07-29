/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Homework7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] ten = new String[10];
        int[] toan = new int[10];
        int[] van = new int[10];
        int[] anh = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("nhap nguoi thu " + (i + 1) + ": ");
            ten[i] = sc.nextLine().trim();
            System.out.print("diem cac mon toan, van ,anh: ");
            toan[i] = sc.nextInt();
            van[i] = sc.nextInt();
            anh[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-20s -Toan %2d -Van %2d -Anh %2d\n", ten[i], toan[i], van[i], anh[i]);
        }
        max3(toan, ten);
        min4(van, ten);
        for (int i = 0; i < 10; i++) {
            if (anh[i] == 8) {
                System.out.println(ten[i]);
            }
        }
        //bai1
        System.out.print("nhap ten can tim:");
        String name = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            if (ten[i].toLowerCase().contains(name.toLowerCase())) {
                System.out.println(ten[i] + " -Toan " + toan[i] + " -Van " + van[i] + " -Anh " + anh[i]);
            } else {
                System.out.println("khong tim thay");
            }
        }
        //bai2
        System.out.print("nhap n=");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("NHAP k=");
        int k = sc.nextInt();
        sapxep(a, k);
    }

    static void max3(int[] a, String[] name) {
        int ktra = 0;
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            ktra = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    ktra++;
                }
            }
            if (ktra >= 7) {
                System.out.println(name[i]);
                dem++;
            }
            if (dem > 2) {
                break;
            }
        }
    }

    static void min4(int[] a, String[] name) {
        int ktra = 0;
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            ktra = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    ktra++;
                }
            }
            if (ktra >= 6) {
                System.out.println(name[i]);
                dem++;
            }
            if (dem > 3) {
                break;
            }
        }
    }

    static void sapxep(int[] a, int k) {
        for (int i = k; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
