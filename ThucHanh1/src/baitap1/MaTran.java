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
public class MaTran {
    private int [][] a;
    private int n;
    private Scanner sc = new Scanner(System.in);
    
    public MaTran() {
        System.out.print("Nhap kich thuoc: ");
        n = Integer.parseInt(sc.nextLine());
        a = new int[n][n];
    }
    
    private boolean checkNgto(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void nhap() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("Nhap " + (i + 1) + " " + (j + 1) + ": ");
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    public void inRaNguyenTo() {
        System.out.print("Cac so nguyen to cua ma tran la: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(checkNgto(a[i][j])) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
    
    public void viet() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
