/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Thread() {
            public void run() {
                System.out.print("Nhap mau: ");
                String mau = sc.nextLine();
                String tmp[] = mau.split(" ");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < tmp.length; j++) {
                        try {
//                            System.out.println("\033[0;31m" + tmp[j]);
                            switch(tmp[j]) {
                                case "BLACK":
                                    System.out.println("\33[30m" + tmp[j]);
                                    break;
                                case "RED":
                                    System.out.println("\33[31m" + tmp[j]);
                                    break;
                                case "GREEN":
                                    System.out.println("\33[32m" + tmp[j]);
                                    break;
                                case "YELLOW":
                                    System.out.println("\33[33m" + tmp[j]);
                                    break;
                                case "BLUE":
                                    System.out.println("\33[34m" + tmp[j]);
                                    break;
                                case "PURPLE":
                                    System.out.println("\33[35m" + tmp[j]);
                                    break;
                                case "CYAN":
                                    System.out.println("\33[36m" + tmp[j]);
                                    break;
                            }
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            System.out.println(ex);
                        }
                    }
                }
            }
        }.start();
    }
}
