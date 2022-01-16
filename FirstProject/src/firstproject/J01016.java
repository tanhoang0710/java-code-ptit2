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
public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int dem4 = 0;
        int dem7 = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '4') dem4++;
            else if(s.charAt(i) == '7') dem7++;
        }
        if(dem4 + dem7 == 4 || dem4 + dem7 == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
