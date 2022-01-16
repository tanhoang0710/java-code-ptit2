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
public class J03021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String s = sc.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean check(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            String str = c.toString();
            if(str.equalsIgnoreCase("a") || str.equalsIgnoreCase("b") || str.equalsIgnoreCase("c"))
                res += "2";
            else if(str.equalsIgnoreCase("d") || str.equalsIgnoreCase("e") || str.equalsIgnoreCase("f"))
                res += "3";
            else if(str.equalsIgnoreCase("g") || str.equalsIgnoreCase("h") || str.equalsIgnoreCase("i"))
                res += "4";
            else if(str.equalsIgnoreCase("j") || str.equalsIgnoreCase("k") || str.equalsIgnoreCase("l"))
                res += "5";
            else if(str.equalsIgnoreCase("m") || str.equalsIgnoreCase("n") || str.equalsIgnoreCase("o"))
                res += "6";
            else if(str.equalsIgnoreCase("p") || str.equalsIgnoreCase("q") || str.equalsIgnoreCase("r") || str.equalsIgnoreCase("s"))
                res += "7";
            else if(str.equalsIgnoreCase("t") || str.equalsIgnoreCase("u") || str.equalsIgnoreCase("v"))
                res += "8";
            else if(str.equalsIgnoreCase("w") || str.equalsIgnoreCase("x") || str.equalsIgnoreCase("y") || str.equalsIgnoreCase("z"))
                res += "9";
            else res += "";
        }
        String tmp = new StringBuilder(res).reverse().toString();
        return res.equals(tmp);
    }
}
