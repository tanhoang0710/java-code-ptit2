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
public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            solve(s);
        }
    }
    
    public static void solve(String s) {
        s = s.trim().toLowerCase();
        String tmp[] = s.split("\\s+");
        String ss = "";
        for (int i = 1; i < tmp.length - 1; i++) {
            Character c = tmp[i].charAt(0);
            ss += c.toString().toUpperCase() + tmp[i].substring(1) + " ";
        }
        Character c = tmp[tmp.length - 1].charAt(0);
        ss += c.toString().toUpperCase() + tmp[tmp.length - 1].substring(1);
        ss += ", ";
        System.out.println(ss + tmp[0].toUpperCase());
    }
}
