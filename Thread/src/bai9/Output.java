/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Output extends Thread{
    private Data d;

    public Output() {
    }

    public Output(Data d) {
        this.d = d;
    }
    
    public void run() {
        while (d.isRunning()) {            
            synchronized(d) {
                try {
                    d.wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                int num1 = d.get();
                if(num1 == 0){
                    d.setRunning(false);
                    d.notify();
                    break;
                }
                int num2 = d.get();
                System.out.print("Tong: " + (num1 + num2) + "\n");
                d.setIndex(1);
                d.notify();
            }
        }
    }
}
