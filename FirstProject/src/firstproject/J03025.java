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
public class J03025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String s = in.next();
            int len = s.length();
            int l, r;
            int count = 0;
            if(len % 2 == 0){
                l = (len/2) - 1;
                r = len/2;
            }else{
                l = (len/2)-1;
                r = (len/2)+1;
            }
            while(l >=0){
                if(s.charAt(l) != s.charAt(r))
                    count += 1;
                l--; r++;
            }
            if(count == 1 || (len % 2 == 1 && count == 0))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
