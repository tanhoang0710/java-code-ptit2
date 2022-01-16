/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long[] a= new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            int res = -1;
            for (int i = 1; i < n; i++) {
                a[i] += a[i - 1];
            }
            for (int i = 1; i < n - 1; i++) {
                if(a[i - 1] == a[n - 1] - a[i]){
                    res = i + 1;
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
