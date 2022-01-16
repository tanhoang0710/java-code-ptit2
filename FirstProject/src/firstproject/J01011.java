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
public class J01011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {            
            long a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println((a * b) / gcd(a, b)+ " " + gcd(a, b));
        }
    }
    public static long gcd(long a, long b) {
        long tmp = 0;
        while(b != 0){
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
