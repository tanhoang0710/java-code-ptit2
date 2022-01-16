/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author DELL
 */
public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            solve(s1, s2);
        }
    }
    public static void solve(String s1, String s2){
        Set<String> list = new HashSet<>();
        String tmp1[] = s1.split(" ");
        String tmp2[] = s2.split(" ");
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (String x : tmp1) {
            list1.add(x);
        }
        for (String x : tmp2) {
            list2.add(x);
        }
        for (String x : list1) {
            if(!list2.contains(x)){
                list.add(x);
            }
        }
        for (String x : list) {
            System.out.print(x + " ");
        }
//            System.out.println(list1 + " " +  list2);
        System.out.println();
    }
}
