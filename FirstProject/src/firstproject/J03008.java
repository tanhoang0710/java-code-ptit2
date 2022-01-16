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
public class J03008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.next();
            if(check1(s) && check2(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static boolean check1(String s) {
        String tmp = new StringBuilder(s).reverse().toString();
        return s.equals(tmp);
    }
    
    public static boolean check2(String s){
        for (int i = 0; i < s.length(); i++) {
            Character c1 = s.charAt(i);
            int digit = Integer.parseInt(c1.toString());
            if(!isPrime(digit)) return false;
        }
        return true;
    }
}
