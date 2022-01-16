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
public class Thread2 extends Thread{
    private int num;
    private boolean isPrime(int n){
        for(int i = 2;i <= Math.sqrt(n); i++){
            if(n % i == 0) 
                return false;
        } 
        return true;
    }
    private boolean check(int n){
        String s = n + "";
        if(s.endsWith("3") && isPrime(n)) return true;
        else return false;
    }

      public Thread2(int num) {
          this.num=num;
      }
    @Override
    public void run(){
        int n=num;
        int p=3;
        while(n>=0){
            while (true) {
                if(check(p)){
                    System.out.println("Nguyen to: " + p);
                    p++;
                    break;
                }
            } n--;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
