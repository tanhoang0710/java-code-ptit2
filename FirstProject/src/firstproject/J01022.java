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
public class J01022 {
    static long dp[] = new long[93];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= 92; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        while(t-- > 0) {
            int n;
            long k;
            n = sc.nextInt();
            k = sc.nextLong();
            System.out.println(fibo(n, k));
        }
    }
    
    public static long fibo(int n, long k) {
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(k <= dp[n- 2]) return fibo(n - 2, k);
        else return fibo(n - 1, k - dp[n - 2]);
    }
}
