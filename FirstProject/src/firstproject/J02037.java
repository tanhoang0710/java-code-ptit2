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
public class J02037 {
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
        String tmp[] = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String x : tmp) {
            Integer n = Integer.parseInt(x);
            list.add(n);
        }
        if(check1(list) || check2(list)) return true;
        return false;
    }
    
    public static boolean check1(List<Integer> list) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0)
                count1 += 1;
            else 
                count2 += 1;
        }
        return count1 > count2 && list.size() % 2 == 0;
    }
    
    public static boolean check2(List<Integer> list) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0)
                count1 += 1;
            else 
                count2 += 1;
        }
        return count1 < count2 && list.size() % 2 != 0;
    }
}
