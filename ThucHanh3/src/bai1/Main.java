/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        GiaoBai gb = new GiaoBai();
        LamBai lb = new LamBai();
        ChamBai cb = new ChamBai();
        gb.start();
        lb.start();
        try {
            gb.join();
            lb.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        cb.start();
    }
}
