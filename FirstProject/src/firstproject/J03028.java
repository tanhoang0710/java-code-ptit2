/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.*;

/**
 *
 * @author DELL
 */
public class J03028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test;
        test = Integer.parseInt(sc.nextLine());
        while(test-- > 0){
            String s;
            s = sc.nextLine();
            String[] s1 = new String[(s.length())/2];
            String[] s2 = new String[(s.length())/2];
            long sum = 0,sum1=0;
            for(int i = 0;i<(s.length())/2;i++){
                Character c = s.charAt(i);
                s1[i] = (c.toString());
                sum += (int)s.charAt(i) - 65;
            }
            for(int i = (int)(s.length())/2;i<s.length();i++){
                Character c = s.charAt(i);
                s2[i] = (c.toString());
                sum1+=(int)s.charAt(i)-65;
            }
            for(int i = 0;i<s1.length;i++){
                int x = Integer.parseInt(s1[i]);
                double tmp = (( x - 65 + sum) % 26) + 65;
                s1[i] = tmp + "";
            }
            for(int i = 0;i<s2.length;i++){
                int x = Integer.parseInt(s2[i]);
                double tmp = (( x - 65 + sum) % 26) + 65;
                s2[i] = tmp + "";
            }
            for(int i = 0;i<s1.length;i++){
                int x = Integer.parseInt(s1[i]);
                int y = Integer.parseInt(s2[i]);
                double tmp = ((x-65+(y-65))%26)+65;
                s1[i] = tmp + "";
            }
            for (int i = 0; i < s1.length; i++) {
                System.out.print(s1[i]);
            }
            System.out.println();
        }
    }
}
