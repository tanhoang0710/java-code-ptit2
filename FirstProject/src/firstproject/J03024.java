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
public class J03024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            if(isValid(s)){
                if(check1(s)){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }else {
                System.out.println("INVALID");
            }
        }
    }
    
    public static boolean isValid(String s){
        if(s.charAt(0) == '0') return false;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(!Character.isDigit(c)) return false;
        }
        return true;
    }
    
    public static boolean check1(String s) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            int n = Integer.parseInt(c.toString());
            if(n % 2 == 0) {
                count1 += 1;
            }else count2 += 1;
        }
        if((s.length() % 2 == 0 && count1 > count2) || (s.length() % 2 == 1 && count1 < count2)) return true;
        return false;
    }
}
