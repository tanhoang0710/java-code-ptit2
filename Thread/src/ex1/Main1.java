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
public class Main1 {
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo("Nhom 2");
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
    }
}
 