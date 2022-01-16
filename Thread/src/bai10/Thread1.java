/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Thread1 extends Thread{
    private Data d;

    public Thread1(Data d) {
        this.d = d;
    }
    

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while(d.isRunning()) {
            synchronized(d) {
                int num = (int) (Math.random() * 100);
                d.addBackUp(num);
                try {
                    sleep(1000);
                    System.out.println("\33[31m" + num);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                int tong = 0;
                for (int i = 0; i < d.getTmp().size(); i++) {
                    tong += d.getTmp().get(i);
                }
                if(tong >= 200) {
                    d.setRunning(false);
                    d.notifyAll();
                    break;
                }
                if(tongCS(num) % 3 == 0){
                    d.add(num);
                    d.setIndex(2);
                    d.notifyAll();
                } else {
                    d.add(num);
                    d.setIndex(3);
                    d.notifyAll();
                }
                
                try {
                    d.wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("T1 STOP");
        synchronized(d) {
            d.notifyAll();
            stop();
        }
    }
    
    public int tongCS(int n){
        int tong = 0;
        while(n > 0) {
            tong += n % 10;
            n /= 10;
        }
        return tong;
    }
}
