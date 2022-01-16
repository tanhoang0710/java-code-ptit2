/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J02011 {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        solve(a);
    }
    
    public static void solve(int [] a){
        String ss = "";
        for (int i = 0; i < a.length - 1; i++) {
            ss = "";
            int k = i, tmp = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if(a[j] < tmp){
                    k = j;
                    tmp = a[j];
                }
            }
            int t = a[i];
            a[i] = a[k];
            a[k] = t;
            int x = i + 1;
            ss += "Buoc " + x + ": ";
            for (int m = 0; m < a.length; m++) {
                ss += a[m] + " ";
            }
            list.add(ss);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
