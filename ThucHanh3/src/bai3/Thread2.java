/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Thread2 extends Thread{
    Data d;
    public Thread2() {
    }

    public Thread2(Data d) {
        this.d = d;
    }
    @Override
    public void run() {
        String file = "src/bai3/cauhoi.txt";
        try {
            synchronized(d){
                BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                String tmp[] = line.split("\\s+");
                PhanSo p1 = new PhanSo(Long.parseLong(tmp[0]), Long.parseLong(tmp[1]));
                PhanSo p2 = new PhanSo(Long.parseLong(tmp[2]), Long.parseLong(tmp[3]));
                PhanSo p3 = new PhanSo(Long.parseLong(tmp[4]), Long.parseLong(tmp[5]));
                String phepTinh = tmp[6];
                d.setP1(p1);
                d.setP2(p2);
                d.setP3(p3);
                d.setPheptinh(phepTinh);
                d.setIndex(3);
                d.notifyAll();
                try {
                    d.wait();
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
            }
            d.setRunning(false);
            br.close();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
