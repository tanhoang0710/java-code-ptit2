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
public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int res = 0;
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }
    
    public static int solve(int n) {
        int res = 1, cnt = 0;
        while (n % 2 == 0) {
            cnt++;
            n /= 2;
        }

        if (cnt == 0) return 0;
        res *= cnt;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                cnt = 1;

                while (n % i == 0) {
                    cnt++;
                    n /= i;
                }
                
                res *= cnt;
            }
        }

        if (n != 1)
            res *= 2;
        
        return res;
    }
}
