/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        new Thread(){
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("cuc cu");
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
            }
        }.start();
    }
}
