/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import controller.IOFile;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Main1 {
    public static void main(String[] args) {
        List<sinhvien> list = IOFile.doc("src/Object/sv.txt");
        for (sinhvien x : list) {
            System.out.println(x);
        }
    }
      
}
