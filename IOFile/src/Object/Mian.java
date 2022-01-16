/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import controller.IOFile;
import java.util.*;

/**
 *
 * @author DELL
 */
public class Mian {
    public static void main(String[] args) {
        List<sinhvien> list = new ArrayList<>();
        list.add(new sinhvien("1", "to an an", 10, 20));
        list.add(new sinhvien("2", "bac", 8, 21));
        list.add(new sinhvien("3", "tuan binh", 9, 19));
        list.add(new sinhvien("4", "thanh", 7, 20));
        IOFile.viet("src/Object/sv.txt", list);
    }
}
