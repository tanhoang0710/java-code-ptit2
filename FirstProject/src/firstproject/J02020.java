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
public class J02020 {
    static int n, k;
    static int th[] = new int[100];
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println("\nTong cong co " + list.size() + " to hop");
    }
    
    public static void Try(int i) {
        for (int j = th[i - 1] + 1; j <= n - k + i; j++) {
            th[i] = j;
            String tmp = "";
            if(i == k) {
                for (int l = 1; l <= k; l++) {
                    System.out.print(th[l]);
                    tmp += th[l];
                }
                list.add(tmp);
                System.out.print(" ");
            }else Try(i + 1);
        }
    }
}
