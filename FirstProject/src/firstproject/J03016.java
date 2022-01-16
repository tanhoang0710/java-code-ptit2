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
public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String s = sc.nextLine();
            if(check(s)) System.out.println("1");
            else System.out.println("0");
        }
    }
    
    public static boolean check(String s){
        long res = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            int n = Integer.parseInt(c.toString());
            if(i % 2 == 0) res += n;
            else res -= n;
        }
        return res % 11 == 0;
    }
}
