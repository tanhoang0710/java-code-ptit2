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
public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {            
            int n = sc.nextInt();
            int h = sc.nextInt();
            for (int i = 1; i < n; i++) {
                System.out.printf("%.6f ", h*Math.sqrt((double)i/n));
            }
            System.out.println();
        }
    }
    
}
