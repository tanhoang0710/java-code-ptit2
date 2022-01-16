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
public class J02010 {
    static List<String> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            list = new ArrayList<>();
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            solve(a);
        }
    }
    
    public static void solve(int [] a){
        String ss ="";
        for (int i = 0; i < a.length - 1; i++) {
            ss ="";
            for (int j = i + 1; j < a.length; j++) {
                if(a[j] < a[i]){
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
            int x = i+ 1;
            ss += "Buoc " + x + ": ";
            for (int k = 0; k < a.length; k++) {
                ss += a[k] + " ";
            }
            list.add(ss);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
