/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class Main1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("nhap ten: ");
            String ten = br.readLine();
            System.out.print("nhap tuoi: ");
            int tuoi = Integer.parseInt(br.readLine());
            System.out.println("ten: " + ten + " tuoi: " + tuoi);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
