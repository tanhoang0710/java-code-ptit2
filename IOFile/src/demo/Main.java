/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        int t = 0;
        String fileName = "src/demo/daySo.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            line = br.readLine();     
            String[] s= line.split("\\s+");
            for (String i : s) {
                t += Integer.parseInt(i);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println(t);
        String fout = "src/demo/out.txt";
        try {
            PrintWriter p = new PrintWriter(fout);
            p.print("Tong: " + t + "\n");
            p.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
        
    }
}
