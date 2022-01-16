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
public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            solve(s);
        }
    }
    
    public static void solve(String s){
        String tmp[] = s.split(" ");
        String res = "";
        for (int i = 0; i < tmp.length; i++) {
            String ss = new StringBuilder(tmp[i]).reverse().toString();
            res += ss + " ";
        }
        System.out.println(res);
    }
}
