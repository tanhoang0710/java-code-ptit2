/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J02012 {
    static List<String> lst = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        solve(a);
    }
    
    public static void solve(int []a){
        List<Integer> list = new ArrayList<>();
        String ss = "";
        for (int i = 0; i < a.length; i++) {
            ss = "";
            ss += "Buoc " + (i) + ": ";
            list.add(a[i]);
            Collections.sort(list);  
            for (Integer ele : list) {
                ss += ele + " ";
            }
            lst.add(ss);
        }
        for (int i = lst.size() - 1; i >= 0; i--) {
            System.out.println(lst.get(i));
        }
    }
}
