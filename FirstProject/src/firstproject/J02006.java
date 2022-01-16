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
public class J02006 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        int n = Integer.parseInt(sc.next());
//        int m = Integer.parseInt(sc.next());
//        int a[] = new int[n];
//        int b[] = new int[m];
//        for (int i = 0; i < n; i++) {
//            a[i] = Integer.parseInt(sc.next());
//        }
//        for (int i = 0; i < m; i++) {
//            b[i] = Integer.parseInt(sc.next());
//        }
//        
//        solve(n, m, a, b);
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
        list.addAll(s2);
        for (Integer integer : s1) {
            if (s2.contains(integer) == false)
                list.add(integer);
        }
        
        Collections.sort(list);
        
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        
    }
    
//    public static void solve(int n, int m, int a[], int b[]) {
//        HashSet<Integer> tmp = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            tmp.add(a[i]);
//        }
//        for (int i = 0; i < m; i++) {
//            tmp.add(b[i]);
//        }
//        ArrayList<Integer> res = new ArrayList<>(tmp);
//        for (Integer x : res) {
//            System.out.print(x);
//            System.out.print(" ");
//        }
//        
//    }
}
