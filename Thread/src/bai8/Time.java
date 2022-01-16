/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Time extends Thread{

    public Time() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
                // System.out.println(new SimpleDateFormat("hh:mm:ss").format(Calendar.getInstance().getTime()));
                System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
    
    
}
