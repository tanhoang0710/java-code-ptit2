/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 1; i <= n; i++) {
                Phong x = new Phong(sc.nextLine());
                d.addPhong(x);
            }
            int m = Integer.parseInt(sc.nextLine());
            for (int i = 1; i <= m; i++) {
                KhachHang x = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
                d.addKH(x);
            }
            d.show();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
    }
}
