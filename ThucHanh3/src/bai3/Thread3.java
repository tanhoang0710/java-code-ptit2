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
public class Thread3 extends Thread{
    Data d = new Data();
    public Thread3() {
    }

    public Thread3(Data d) {
        this.d = d;
    }
    
    

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        synchronized(d) {
            while (d.isRunning() && d.getIndex() == 3) {   
                int tong = 0;
                System.out.println("Nhap pahn so");
                PhanSo res = new PhanSo(sc.nextLong(), sc.nextLong());
                if(res.tinhHieu(d.getP3()).equals("0")) {
                    tong++;
                }
            }
        }
    }
    
    
}
