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
public class J03027 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String ans = rutGon(s);
        if(ans.length() != 0)
            System.out.println(ans);
        else 
            System.out.println("Empty String");
    }
    public static String rutGon(String s){
        int check = 0;
        String tmp = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                check = 1;
                tmp = s.substring(0, i) + s.substring(i+2);
                break;
            }               
        }
        
        if(check == 0) return s;
        else return rutGon(tmp);
    }
}
