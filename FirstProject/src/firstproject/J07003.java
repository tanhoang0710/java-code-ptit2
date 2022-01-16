/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.nextLine();
        BigInteger b, b1, b2;
        String s1 = "", s2 = "";
        while (s.length() > 1) { 
            s1 = ""; 
            s2 = "";
            for (int i = 0; i < s.length() / 2; i++) {
                s1 += s.charAt(i);
            }
            for (int i = s.length() / 2; i < s.length(); i++) {
                s2 += s.charAt(i);
            }
            b1 = new BigInteger(s1);
            b2 = new BigInteger(s2);
            b = b1.add(b2);
            System.out.println(b);
            s = b.toString();
        }
    }
}
