/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class Main {
    
    public static void main(String[] args) {
        // DOC 1 MA TRAN CHU NHAT
//        String fileName = "src/Bai1/matran.txt";
//        int n = 0,m = 0;
//        int a[][] = null;
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(fileName));
//            String line = "";
//            int count=0;
//            while ((line = br.readLine()) != null) {                
//                String[] tmp = line.split(" ");
//                
//                if(tmp.length == 2 && count == 0){
//                    n = Integer.parseInt(tmp[0]);
//                    m = Integer.parseInt(tmp[1]);
//                    a = new int[n][m];
//                }
//                else{
//                    for (int i = 0; i < tmp.length; i++) {
//                        a[count - 1][i] = Integer.parseInt(tmp[i]);
//                    }
//                }
//                count++;
//            }
//            br.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//        System.out.println(n + " " + m);
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
        
        // DOC 2 MA TRAN CHU NHAT
        String fileName = "src/Bai1/matran.txt";
        int n = 0,m = 0;
        int a[][] = null;
        int b[][] = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            int count=0;
            while ((line = br.readLine()) != null) {                
                String[] tmp = line.split(" ");
                
                if(tmp.length == 2 && count == 0){
                    n = Integer.parseInt(tmp[0]);
                    m = Integer.parseInt(tmp[1]);
                    a = new int[n][m];
                    b = new int[n][m];
                }
                else if(count <= n){
                    for (int i = 0; i < tmp.length; i++) {
                        a[count - 1][i] = Integer.parseInt(tmp[i]);
                    }
                }else if(count > n){
                    for (int i = 0; i < tmp.length; i++) {
                        b[count - n - 1][i] = Integer.parseInt(tmp[i]);
                    }
                }
                count++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(n + " " + m);
        System.out.println("Ma tran A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Ma tran B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
