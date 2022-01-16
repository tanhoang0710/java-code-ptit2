/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

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
        String fileName = "src/Bai2/matran.txt";
        int n = 0;
        int a[][] = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            int count = 0;
            while ((line = br.readLine()) != null) {    
                String[] tmp = line.split(" ");
                if(tmp.length == 1 && count == 0){
                    n = Integer.parseInt(tmp[0]);
                    a = new int[n][n];
                }else{
                    for (int i = 0; i < tmp.length; i++) {
                        a[count - 1][i] = Integer.parseInt(tmp[i]);
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
