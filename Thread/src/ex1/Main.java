/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import static java.lang.Thread.sleep;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " START");
//        System.out.println(t.getPriority());
//        System.out.println(t.getState());
        for (int i = 0; i < 12; i++) {
            System.out.println(t.getName() + " " + i);
        }
        
        try {
            sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        DeamonThread tt = new DeamonThread();
        tt.setDaemon(true);
        tt.start();
    
        ThreadDemo t1 = new ThreadDemo("Gio moi");
        t1.start();

        
        RunnableDemo r = new RunnableDemo("Nhom 2");
        Thread t2 = new Thread(r);
        t2.start();
        
        System.out.println(t.getName() + " STOP");

        
        
    }
}
