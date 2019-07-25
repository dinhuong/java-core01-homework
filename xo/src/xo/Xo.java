/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xo;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Xo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int d = 0;
        int b=0;
        int c=0;
        while (!win(a,b,c)) {
            System.out.print("P1:");
            b = sc.nextInt()-1;
            c = sc.nextInt()-1;
            while (a[b][c] != 0) {
                System.out.println("danh lai");
                System.out.print("P1:");
                b = sc.nextInt();
                c = sc.nextInt();
            }
            a[b][c] = 1;
            d++;
            pr(a);
            if (win(a,b,c) || d == 9) {
                break;
            }
            System.out.print("P2:");
            b = sc.nextInt()-1;
            c = sc.nextInt()-1;
            while (a[b][c] != 0) {
                System.out.println("danh lai");
                System.out.print("P2:");
                b = sc.nextInt();
                c = sc.nextInt();
            }
            a[b][c] = 2;
            d++;
            pr(a);
        }
        if (win(a)) {
            System.out.print("end game => P" + (d % 2 == 0 ? 2 : 1) + " win");
        } else {
            System.out.print("Play again");
        }
    }

    static void pr(int a[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean win(int a[][], int x, int y) {
        boolean k = false;
//        if (a[0][0] != 0 && a[0][0] == a[1][1] && a[1][1] == a[2][2]) {
//            return true;
//        } else {
//            if (a[0][2] != 0 && a[0][2] == a[1][1] && a[1][1] == a[2][0]) {
//                return true;
//            } else {
//                if (a[0][0] != 0 && a[0][0] == a[0][1] && a[0][1] == a[0][2]) {
//                   return true;
//                } else {
//                    if (a[1][0] != 0 && a[1][0] == a[1][1] && a[1][1] == a[1][2]) {
//                        return true;
//                    } else if (a[2][0] != 0 && a[2][0] == a[2][1] && a[2][1] == a[2][2]) {
//                        return true;
//                    } else if (a[0][0] != 0 && a[0][0] == a[1][0] && a[1][0] == a[2][0]) {
//                        return true;
//                    } else if (a[0][1] != 0 && a[0][1] == a[1][1] && a[1][1] == a[2][1]) {
//                        return true;
//                    } else if (a[0][2] != 0 && a[0][2] == a[1][2] && a[1][2] == a[2][2]) {
//                        return true;
//                    } else {
//                        return false;
//                    }
//                }
//            }
//        } 
//        if (a[b][c] != 0 && a[b][c] == a[b - 1][c - 1] && a[b][c] == a[b + 1][c + 1]) {
//            return true;
//        } else {
//            if (a[b][c] != 0 && a[b][c] == a[b][c - 1] && a[b][c] == a[b][c + 1]) {
//                return true;
//            } else {
//                if (a[b][c] != 0 && a[b][c] == a[b - 1][c] && a[b][c] == a[b + 1][c]) {
//                    return true;
//                } else {
//                    if (a[b][c] != 0 && a[b - 1][c - 1] == a[b][c] && a[b][c] == a[b + 1][c + 1]) {
//                        return true;
//                    } else {
//                        
//                }
//            }
//        }
        if ((a[x][0] != 0 && a[x][1] == a[x][2] && a[x][0] == a[x][2])
                || (a[0][y] != 0 && a[0][y] == a[1][y] == a[2][y])
                || (a[0][0] != 0 && a[0][0] == a[1][1] && a[0][0] == a[2][2])
                || (a[0][2] != 0 && a[1][1] = a[0][2] && a[1][1] == a[2][0])) {
            k = true;
        }
        return k;
    }
}
