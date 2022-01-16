/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiLamThem;

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
        int n1 = 0, m1 = 0;
        int n2 = 0, m2 = 0;
        int a[][] = null, b[][] = null;
        String fileName = "src/BaiLamThem/MaTran.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            int count = 0;
            String line = "";
            while ((line = br.readLine()) != null) {                
                String tmp[] = line.split(" ");
                if(tmp.length == 2 && count == 0) {
                    n1 = Integer.parseInt(tmp[0]);
                    m1 = Integer.parseInt(tmp[1]);
                    a = new int[n1][m1];
                }else if(tmp.length == 2 && count == n1 + 1) {
                    n2 = Integer.parseInt(tmp[0]);
                    m2 = Integer.parseInt(tmp[1]);
                    b = new int[n2][m2];
                }else if(count <= n1) {
                    for (int i = 0; i < tmp.length; i++) {
                        a[count - 1][i] = Integer.parseInt(tmp[i]); 
                    }
                }else if(count > n1 + 1) {
                    for (int i = 0; i < tmp.length; i++) {
                        b[count - 2 - n1][i] = Integer.parseInt(tmp[i]); 
                    }
                }
                count++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        }
        
        System.out.println(n1 + " " + m1);
        System.out.println("Ma tran 1:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(n2 + " " + m2);
        System.out.println("Ma tran 2:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
