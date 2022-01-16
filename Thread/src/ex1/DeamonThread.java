/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author DELL
 */
public class DeamonThread extends Thread{
    public void run() {
        int i = 0;
        while(true) {
            System.out.println("Number: " + i++);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    
    public void finalize() {
        System.out.println("STOPPPPPPPPPPP");
    }
}
