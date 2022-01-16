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
public class Input extends Thread{
    private Data d;

    public Input() {
    }

    public Input(Data d) {
        this.d = d;
    }
    
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (d.isRunning()) {            
            synchronized(d) {
                System.out.print("Nhap so 1: ");
                int num1 = sc.nextInt();
                d.add(num1);
                if(num1 == 0){
                    d.setRunning(false);
                    d.notify();
                    break;
                }
                System.out.print("Nhap so 2: ");
                int num2 = sc.nextInt();
                d.add(num2);
                d.setIndex(2);
                d.notify();
                try {
                    d.wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
