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
public class Main {
    public static void main(String[] args) {
        Time t = new Time();
        Clock c = new Clock();
        Person p = new Person();
        t.start();
        c.start();
        try {
            t.join();
            c.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.start();
    }
}
