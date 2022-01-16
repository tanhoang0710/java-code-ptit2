/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

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
        String fileName = "src/Bai4/DaThuc.txt";
        int bacDaThuc1 = 0, bacDaThuc2 = 0;
        double a[] = null;
        double b[] = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            int count = 0;
            while ((line = br.readLine()) != null) {                
                String tmp[] = line.split(" ");
                if(tmp.length == 1 && count == 0){
                    bacDaThuc1 = Integer.parseInt(tmp[0]);
                    a = new double[bacDaThuc1 + 1];
                }else if(tmp.length == 1 && count == 2) {
                    bacDaThuc2 = Integer.parseInt(tmp[0]);
                    b = new double[bacDaThuc2 + 1];
                }else if(count == 1) {
                    for (int i = 0; i < tmp.length; i++) {
                        a[i] = Double.parseDouble(tmp[i]);
                    }
                }else if(count == 3) {
                    for (int i = 0; i < tmp.length; i++) {
                        b[i] = Double.parseDouble(tmp[i]);
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
        System.out.println("Da thuc A:");
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println("\nDa thuc B:");
        
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
