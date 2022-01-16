/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "src/Bai5/PhanSo.txt";
        List<Fraction> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {                
                String tmp[] = line.split("\\s+");
                int tuSo = Integer.parseInt(tmp[0]);
                int mauSo = Integer.parseInt(tmp[1]);
                list.add(new Fraction(tuSo, mauSo));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        Fraction t = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            t = t.tinhTong(list.get(i));
        }
        System.out.println(t);
    }
}
