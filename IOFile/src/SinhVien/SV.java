/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class SV {
    public static void main(String[] args) {
        String fileName = "src/SinhVien/sv.dat";
        List<sinhvien> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {                
                String[] s = line.split("\\,\\s+");
                list.add(new sinhvien(s[0], s[1], Integer.parseInt(s[2]), s[3]));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        for (sinhvien x : list) {
            System.out.println(x);
        }
    }
}
