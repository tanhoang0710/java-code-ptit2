/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
                Scanner in=new Scanner(System.in);
                String date=in.nextLine();
                while (true) {
                    System.out.println(f.format(new Date()));
                    if(date.equals(f.format(new Date()))){
                         System.out.println("“****** RENG RENG RENG *******”");
                         break;
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        }.start();

//                            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
//                Date d = new Date();
//                System.out.println(sdf.format(d));
    }
}
