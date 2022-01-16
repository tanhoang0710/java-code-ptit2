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
public class J03017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1' && s.charAt(i + 1) == '0' && s.charAt(i + 2) == '0'){
                StringBuilder sb = new StringBuilder(s);
                sb.deleteCharAt(i);
                sb.deleteCharAt(i + 1);
                sb.deleteCharAt(i + 2);
                res += 3;
            }
        }
        System.out.println(res);
    }
}
