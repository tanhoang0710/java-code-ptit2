/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Clock extends Thread{

    public Clock() {
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                try {
                    sleep(1000);
                    System.out.println("Dog: Watching, watching...");
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
            }
            sleep(1000);
            System.out.println("Dog: Go, go, go, go...");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
    
    
}
