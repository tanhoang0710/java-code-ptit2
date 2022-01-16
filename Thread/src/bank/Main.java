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
public class Main {
    public static void main(String[] args) {
        Account a = new Account();
        Thread1 h = new Thread1("Husband", 3500, a);
        h.start();
        Thread2 w = new Thread2("Wife", 1000, a);
        w.start();
    }
}
