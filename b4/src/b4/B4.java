/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b4;

import static java.lang.Math.sqrt;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class B4 {

    public static void main(String[] args) {
        /*        System.out.print("=====bai1=====\n2 ");
        for (int i = 3; i < 1000; i++) {
            if (i % 2 != 0) {
                if (kt(i) == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println("\n=====bai2=====");
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (ntcn(a, b) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.print("=====bai4=====\n2 ");
        for (int i = 3; i < 1000000; i++) {
            if (i % 2 != 0) {
                if (kt(i) == 0) {
                    System.out.print(i + " ");
                }
            }
        }
         */ int[] aa = {11, 2, 6, 9, 10};
        int[] bb = {1, 2, 2, 3, 8, 9};
        for (int i = 0; i < merge(aa, bb).length; i++) {
            System.out.print(merge(aa, bb)[i] + " ");
        }
    }

    /*
    static int kt(int k) {
        int d = 0;
        for (int i = 2; i <= sqrt(k); i++) {
            if (k % i == 0) {
                d = 1;
            }
        }
        return d;
    }

    static int ntcn(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    static void bai4() {
        boolean[] snt = new boolean[100000];
        snt[0] = true;
        snt[1] = true;
        for (int i = 1; i < snt.length; i++) {
            if (snt[i] = false) {
                for (int j = i * 2; j < snt.length; j = j + i) {
                    snt[j] = true;
                }
            }
        }
        for (int i = 1; i < snt.length; i++) {
            if (snt[i] = false) {
                System.out.print(i + " ");
            }
        }
        // Float.parseFloat("3.14"); //wrapper
        //overload

    }
     */
    static int[] merge(int[] a, int[] b) {
        int[] c;
        c = new int[a.length + b.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < c.length; i++) {
            if (j == a.length) {
                c[i] = b[k];
                k++;
                continue;
            }
            if (k == b.length) {
                c[i] = a[j];
                j++;
                continue;
            }
            if (a[j] < b[k]) {
                c[i] = a[j];
                j++;
            } else {
                c[i] = b[k];
                k++;
            }
        }
        return c;
    }

    static int[] mergesort(int[] a) {
        if (a.length == 1) {
            return a;
        } else {
            int mid = a.length / 2;
            int[] left = Arrays.copyOfRange(a, 0, mid);
            int[] right = Arrays.copyOfRange(a, mid, a.length);
            left = mergesort(left);
            right = mergesort(right);
            return merge(left, right);
        }
    }
}
//HashMap<String,Integer> map = new HashMap<>(); //tu hoc
