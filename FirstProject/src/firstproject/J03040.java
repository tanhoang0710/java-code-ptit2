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
public class J03040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {            
            String s = sc.nextLine();
            if(solve(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean solve(String s) {
        String tmp = s.split("-")[1];
        String bienSo = tmp.substring(0, 3) + tmp.substring(4);
        if(check1(bienSo) || check2(bienSo) || check3(bienSo) || check4(bienSo)) return true;
        return false;
    }
    
    public static boolean check1(String bienSo) {
        for (int i = 0; i < bienSo.length() - 1; i++) {
            Character c1 = bienSo.charAt(i);
            Character c2 = bienSo.charAt(i + 1);
            int a = Integer.parseInt(c1.toString());
            int b = Integer.parseInt(c2.toString());
            if(b <= a) return false;
        }
        return true;
    }
    
    public static boolean check2(String bienSo) {
        for (int i = 0; i < bienSo.length() - 1; i++) {
            Character c1 = bienSo.charAt(i);
            Character c2 = bienSo.charAt(i + 1);
            int a = Integer.parseInt(c1.toString());
            int b = Integer.parseInt(c2.toString());
            if(b != a) return false;
        }
        return true;
    }
    
    public static boolean check3(String bienSo) {
        //22233
        String tmp1 = bienSo.substring(0, 3);
        String tmp2 = bienSo.substring(3);
        if(check2(tmp1) && check2(tmp2)) return true;
        return false;
    }
    
    public static boolean check4(String bienSo){
        for (int i = 0; i < bienSo.length(); i++) {
            Character c1 = bienSo.charAt(i);
            if(c1 != '6' && c1 != '8')
                return false;
        }
        return true;
    }
}
