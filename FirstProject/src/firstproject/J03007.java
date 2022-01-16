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
public class J03007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.next();
            if(check3(s) && check1(s) && check2(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean check1(String s) {
        String tmp = new StringBuilder(s).reverse().toString();
        return s.equals(tmp);
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
    
    public static boolean check3(String s){
        return s.charAt(0) == '8';
    }
}
