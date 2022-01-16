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
public class J03026 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String s1 = in.next();
            String s2 = in.next();
            int ans = xauKhacNhauDaiNhat(s1, s2);
            System.out.println(ans);
        }
    }
    public static int xauKhacNhauDaiNhat(String s1, String s2){
        if(s1.length() != s2.length())
            return s1.length() > s2.length() ? s1.length(): s2.length();
        if(s1.contains(s2)) return -1; 
        int ans = -1;
        String str = "";
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = i; j <= s1.length(); j++) {
                str = s1.substring(i, j);
                if(s2.contains(str) == false){
                    ans = Integer.max(ans, j - i);
                }                  
            }
        }
        for (int i = s1.length(); i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                str = s1.substring(j, i);
                if(s2.contains(str) == false){
                    ans = Integer.max(ans, j - i);
                }   
            }
        }
        return ans;
    }
}
