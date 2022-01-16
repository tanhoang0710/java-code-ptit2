/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {            
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            System.out.println("Test " + i + ":");
            solve(a);
        }
    }
    
    public static void solve(int[] a){
        List<Integer> l = new ArrayList<>();
        for (Integer x : a) {
                l.add(x);
        }
        for (int i = 0; i < a.length; i++) {
            if(l.get(i) > 0){
                int count = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if(a[i] == a[j]){
                        count ++;
                        l.set(j, 0);
                    }
                }
                System.out.println(a[i] + " xuat hien " + count + " lan");
            }
        }
    }
}
