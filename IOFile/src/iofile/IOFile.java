/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class IOFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fileName = "src/iofile/Hanoi.txt";
        File f = new File(fileName);
//        System.out.println(f.getAbsolutePath());
//        System.out.println(f.getName());
//        System.out.println(new Date(f.lastModified()));
//        System.out.println(f.length());
//        File f1 = new File("src/iofile/Hanoi1.txt");
//        System.out.println(f1.exists());

//        FileReader r;
//        try {
//            r = new FileReader(f);
//            int k;
//            while (true) {                
//                k = r.read();
//                if(k == -1) 
//                    break;
//                char c = (char)k;
//                System.out.print(c);
//            }
//            r.close();
//        } catch (FileNotFoundException e) {
//            
//        } catch (IOException e) {
//            
//        }


            try {
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                String line = "";
                while ((line = br.readLine()) != null) {                    
                    System.out.println(line);
                }
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
           
    }
    
}
