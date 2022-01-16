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
public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        solve(a);
    }
    
    public static void solve(int a[][]) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            int dem0 = 0, dem1 = 0;
            for (int j = 0; j < 3; j++) {
                if(a[i][j] == 0) dem0 += 1;
                else dem1 += 1;
            }
            if(dem1 > dem0) res++;
        }
        System.out.println(res);
    }
}
