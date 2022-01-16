/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Nhap: ");
        int n;
        n=Integer.parseInt(in.nextLine());
        Thread1 t1 = new Thread1(n);
        Thread2 t2 = new Thread2(n);
        t1.start(); 
        t2.start();
    }
}
