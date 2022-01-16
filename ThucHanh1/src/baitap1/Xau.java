/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Xau {
    private String s;

    public Xau() {
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao xau: ");
        s = sc.nextLine();
    }
    
    public void kiemmTra() {
        String regex = "^[XN]PTIT[0-9]{2}";
        if(s.matches(regex)){
            System.out.println("Dung");
        }else {
            System.out.println("Sai");
        }
    }
    
    
    public void tachSo() {
        s = s.trim();
        String[] result = s.split("[a-zA-Z\\s]+");
        System.out.println("Tach so:");

        for (String i : result) {
            if (i != "") System.out.println(i);
        }
    }
}
