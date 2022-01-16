/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Thread1 extends Thread{

    @Override
    public void run() {
        int time = 0;
        try {
            sleep(1000);
            time += 1;
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println(time);
    }
    
}
