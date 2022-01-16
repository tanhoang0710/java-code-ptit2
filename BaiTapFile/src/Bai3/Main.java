/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

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
        String fileName = "src/Bai3/DaySo.txt";
        int n = 0;
        int a[] = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            //while ((line = br.readLine()) != null) {   
            line = br.readLine();
                String tmp[] = line.split("\\s+");
                n = tmp.length;
                a = new int[n];
                for (int i = 0; i < tmp.length; i++) {
                    a[i] = Integer.parseInt(tmp[i]);
                }
            //}
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
