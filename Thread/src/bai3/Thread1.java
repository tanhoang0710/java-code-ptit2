/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author DELL
 */
public class Thread1 extends Thread{
    private int num;
    public Thread1(int num) {
        this.num=num;
    }
    @Override
    public void run(){
        int n=num;
        while (n>=0) {
            System.out.println("\033[31mCount:" + n--);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
