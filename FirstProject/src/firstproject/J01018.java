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
public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.next();
            if(check1(s) && check2(s)) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
    public static boolean check1(String s){
        for (int i = 0; i < s.length() - 1; i++) {
            Character c1 = s.charAt(i);
            Character c2 = s.charAt(i + 1);
            int diff = Integer.valueOf(c1.toString()) - Integer.valueOf(c2.toString());
            if(Math.abs(diff) != 2){
                return false;
            }
        }
        return true;
    }
    
    public static boolean check2(String s){
        long sum = 0;
        int digit = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c1 = s.charAt(i);
            digit = Integer.parseInt(c1.toString());
            sum += digit;
        }
        return sum % 10 == 0;
    }
}
