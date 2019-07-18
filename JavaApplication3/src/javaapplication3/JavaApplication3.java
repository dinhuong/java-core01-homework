/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;


import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class JavaApplication3 {

    static void inra(int c) {
        System.out.print(c + " ");
    }

    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        array = hamsapxep(array);
        for (int i = 0; i < array.length; i++) {
            inra(array[i]);
        }
        System.out.println("\n" + f(7));
        System.out.print(binarySort(array, 0, n, 5));
    }

    static int[] hamsapxep(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            for (int j = i + 1; j < mang.length; j++) {
                if (mang[i] > mang[j]) {
                    int t = mang[i];
                    mang[i] = mang[j];
                    mang[j] = t;
                }
            }
        }
        return mang;
    }

    static int f(int k) {
        if (k < 3) {
            return 1;
        } else {
            return f(k - 1) + f(k - 2);
        }
    }

    static int binarySort(int[] array, int start, int end, int key) {
        int p = (start + end) / 2;
        if (start == end) {
            return -1;
        }
        if (key == array[p]) {
            return p;
        } else {
            if (key < array[p]) {
                return binarySort(array, start, p, key);
            } else {
                return binarySort(array, p, end, key);
            }
        }
    }
}
