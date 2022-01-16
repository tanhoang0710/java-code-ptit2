/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author DELL
 */
public class Account {
    private long balance = 3000;
    private synchronized boolean check(long value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        return balance > value;
    }
    
    public synchronized void withdraw(String name, long value) {
        System.out.println(name + " withdraw " + value);
        if(!check(value)){
            try {
                System.out.println("Waiting!!!");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        balance -= value;
        System.out.println(name + " successful");
        System.out.println(name + " balance: " + balance);
    }
    
    public synchronized void deposite(String name, long value) {
        System.out.println(name + " deposite" + value);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        balance += value;
        notify();
    }
}
