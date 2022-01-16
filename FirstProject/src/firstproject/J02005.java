/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class J02005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();      
        ArrayList<Integer> list = new ArrayList<>();
        int m = in.nextInt(); int n = in.nextInt();
        for (int i = 0; i < m; i++) {
            s1.add(in.nextInt());
        }
        for (int i = 0; i < n; i++) {
            s2.add(in.nextInt());
        }
        
        for (Integer integer : s1) {
            if (s2.contains(integer))
                list.add(integer);
        }
        
        Collections.sort(list);
        
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        
    }
}
