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
public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int m = 0; m< t; m++) {
            
            long n = sc.nextLong(), count = 0;
            while(n % 2 == 0) {
                n /= 2;
                count++;
            }
            System.out.print("Test " + (m + 1) + ": ");
            if(count > 0) System.out.print(2 + "(" + count + ") ");
            
            for (long i = 3; i * i <= n; i+=2) {
                count = 0;
                while(n % i == 0) {
                    n /= i;
                    count++;
                }

                if(count > 0) System.out.print(i + "(" + count + ") ");
            }
            if (n > 2) System.out.print(n + "(" + 1 + ") ");
            System.out.println();
        }
    }
}
