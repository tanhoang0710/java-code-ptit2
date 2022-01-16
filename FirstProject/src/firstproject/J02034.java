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
public class J02034 {
    static List<Integer> lst = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < a[0]; i++) {
            lst.add(i);
        }
        for (int i = 0; i < n - 1; i++) {
            int x = a[i + 1] - a[i];
            if(x > 1) {
                for (int j = 1; j < x; j++) {
                    lst.add(a[i] + j);
                }
            }
        }
        for (Integer x : lst) {
            System.out.println(x);
        }
        if(lst.isEmpty()) System.out.println("Excellent!");
    }
}
