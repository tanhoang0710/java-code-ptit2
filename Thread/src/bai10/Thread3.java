/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

/**
 *
 * @author DELL
 */
public class Thread3 extends Thread{
    Data d;

    public Thread3() {
    }

    public Thread3(Data d) {
        this.d = d;
    }

    @Override
    public void run() {
        while (true) {            
            synchronized(d){
                d.notifyAll();
                while (d.getIndex() != 3 && d.isRunning()) {                    
                    try {
                        d.wait();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
                if(!d.isRunning())
                    break;
                int num = d.get();
                if(num % 4 ==0) System.out.print("So " + num + " co chia het cho 4");
                else System.out.print("So " + num + " ko chia het cho 4");
                System.out.println();
                d.setIndex(1);
            }
        }
        System.out.println("T3 STOP");
        synchronized(d) {
            stop();
        }
    }
    
    
}
