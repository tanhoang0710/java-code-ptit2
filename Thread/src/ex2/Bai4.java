/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author DELL
 */
public class Bai4 {
    public static void main(String[] args) {
        new Thread(){
            public void run() {
                String line = "HOC VIEN CONG NGHE BUU CHINH VIEN THONG NHOM 2";
                while (true) {                    
                    line = line.charAt(line.length() - 1) + line.substring(0, line.length() - 1);
                    System.out.println(line);
                    try {
                        Thread.sleep(300);
                        
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        }.start();
    }
 
}
