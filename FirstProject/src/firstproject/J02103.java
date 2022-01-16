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
public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i = 1; i<= t; i++){
            
            int n = sc.nextInt(), m = sc.nextInt();
            int a[][] = new int[n][m];
            int b[][] = new int[m][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    a[j][k] = sc.nextInt();
                }
            }
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    b[j][k] = a[k][j];
                }
            }
            int c[][] = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < m; l++) {
                        c[j][k] += a[j][l] * b[l][k];
                    }
                }
            }
            System.out.println("Test " + i + ":");
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(c[j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
