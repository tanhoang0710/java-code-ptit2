/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        String file = "src/bai2/in.txt";
        ArrayList<Time> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {  
                String tmp[] = line.split(" ");
                
                Time t = new Time(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]));
                list.add(t);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        Collections.sort(list, new Comparator<Time>(){
            @Override
            public int compare(Time o1, Time o2) {
                if (o1.cmp() > o2.cmp())
                    return 1;
                return -1;
            }
        });
        
        String fout = "src/bai2/out.txt";
        try {
            PrintWriter p = new PrintWriter(fout);
            for (Time x : list) {
                p.print(x + "\n");
            }
            p.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
    }
}
