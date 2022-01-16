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
public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            if(solve(s)) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
    public static Boolean solve(String s) {
        for (int i = 1; i < s.length(); i++) {
            Character c1 = s.charAt(i);
            Character c2 = s.charAt(i - 1);
            int diff = Math.abs(Integer.parseInt(c1.toString()) - Integer.parseInt(c2.toString()));
            if(diff != 1)
                return false;
        }
        return true;
    }
}
