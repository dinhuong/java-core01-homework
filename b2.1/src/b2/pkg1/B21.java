/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2.pkg1;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class B21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap N=");
        int n=sc.nextInt();
        int[] a;
        a=new int[50];
        for (int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for (int i=0; i<n; i++){
            if (i%2==0) System.out.print(a[i]+" ");
        }    
        int s=0;
        for (int i=0; i<n; i++)
            if (a[i]%7==0) s=s+a[i];
        System.out.println("tong cac so chia het cho 7: "+s);
        
        
        }
    }
    
}
