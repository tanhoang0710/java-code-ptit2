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
public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0) {
            long n = sc.nextLong();
            solve(n);
        }
    }
    
    public static boolean check1(long n) {
        String s = n + "";
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(c != '0' && c != '1' && c != '8' && c != '9')
                return false;
        }
        return true;
    }
        
    public static String catDoi(char n) {
        if(n == '0') return "0";
        else if(n == '1') return "1";
        else if(n == '8') return "0";
        else if(n == '9') return "0";
        else return "-1";
    }
    
    public static boolean check0(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '0') return false;
        }
        return true;
    }
    
    public static void solve(long n) {
        if(!check1(n))
            System.out.println("INVALID");
        else {
            String s = n + "";
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                res += catDoi(c);
            }
            if(check0(res)) System.out.println("INVALID");
            else {
                while(res.charAt(0) == '0') res = res.substring(1);
                System.out.println(res);
            } 
        }
    }
}
