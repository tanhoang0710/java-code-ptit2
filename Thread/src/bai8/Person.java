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
public class Person extends Thread{

    public Person() {
    }

    @Override
    public void run() {
        try {
            sleep(1000);
            System.out.println("Person: WOW big dog!");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        for (int i = 1; i <= 5; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println("Person: " + (i * 10));
        }
    }
    
    
}
