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
public class Thread1 extends Thread{
    public void run() {
        BlockedDemo.method1();
    }
}
