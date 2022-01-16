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
public class J03004 {
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
        for (int i = 0; i < tmp.length; i++) {
            Character c = tmp[i].charAt(0);
            ss += c.toString().toUpperCase() + tmp[i].substring(1) + " ";
        }
        System.out.println(ss);
    }
}
