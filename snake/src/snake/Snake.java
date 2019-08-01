/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Snake {

    /**
     * @param args the command line arguments
     */
    static int[][] bound = new int[10][10];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        bound[0][0] = 1;
        bound[0][1] = 1;
        bound[0][2] = 1;
        int[] x = new int[5];
        int[] y = new int[5];
        y[0] = 0;
        y[1] = 1;
        y[2] = 2;
        bound[5][5] = 2;
        printbound();
        System.out.println("START");
        while (bound[5][5] == 2) {
            System.out.print("nhap buoc di:");
            char k = sc.nextLine().charAt(0);
            ktra(k, x, y);
            printbound();
        }
        System.out.println("WIN");
    }

    static void ktra(char k, int[] x, int[] y) {
        int xx = 0;
        int yy = 0;
        if (k == 'a') {
            xx = x[2];
            yy = (y[2] - 1) == -1 ? 9 : (y[2] - 1);
        }
        if (k == 's') {
            xx = (x[2] + 1) == 10 ? 0 : (x[2] + 1);
            yy = y[2];
        }
        if (k == 'd') {
            xx = x[2];
            yy = (y[2] + 1) == 10 ? 0 : (y[2] + 1);
        }
        if (k == 'w') {
            xx = (x[2] - 1) == -1 ? 9 : (x[2] - 1);
            yy = y[2];
        }
        if (bound[xx][yy] == 1) {
            System.out.print("moi di lai: ");
            char kk = sc.nextLine().charAt(0);
            ktra(kk, x, y);
        } else if (bound[xx][yy] == 0) {
            bound[x[0]][y[0]] = 0;
            for (int i = 0; i < x.length - 1; i++) {
                x[i] = x[i + 1];
                y[i] = y[i + 1];
            }
            x[2] = xx;
            y[2] = yy;
            bound[x[2]][y[2]] = 1;
        } else {
            x[3] = xx;
            y[3] = yy;
            bound[x[3]][y[3]] = 1;
        }

    }

    static void printbound() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (bound[i][j] == 0) {
                    System.out.print(".");
                } else if (bound[i][j] == 1) {
                    System.out.print("O");
                } else {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}
