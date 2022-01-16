/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J02024 {
    public static int b[] = new int[20];
    public static int a[] = new int[20];
    public static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            for (int i = 0; i < 20; i++) {
                b[i] = 0;
            }
            n = in.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
            }
            for (int i = 1; i <= n-1; i++) {
                for (int j = i+1; j <= n; j++) {
                    if(a[i] < a[j]){
                        int tg = a[i];
                        a[i] = a[j];
                        a[j] = tg;
                    }
                }
            }
            Try(1);
            
        }
    }
    
    public static void Try(int i){
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if(i == n){
                int sum = 0;
                for (int k = 1; k <= n; k++) {
                    if(b[k] == 1){
                        sum += a[k];
                    }
                }
                if(sum % 2 == 1)
                    in();
            }else Try(i+1);
        }
    }
    public static void in(){
        for (int i = 1; i <= n; i++) {
            if(b[i] == 1) System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
