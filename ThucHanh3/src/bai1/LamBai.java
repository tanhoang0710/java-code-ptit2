/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class LamBai extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 4; i++) {
            try {
                sleep(1000);
                System.out.println("Sinh viên Tấn làm bài " + i);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println("Sinh viên Tấn làm bài xong");
    }
    
}
