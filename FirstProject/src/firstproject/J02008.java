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
public class J02008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0) {
            int n = sc.nextInt();
            solve(n);
        }
    }
    
    public static void solve(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i / (gcd(res, i));
        }
        System.out.println(res);
    }
    
    public static long gcd(long a, long b){
        long tmp = 0;
        while(b!=0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
