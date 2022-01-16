/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tuSo = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap mau so: ");
        mauSo = Integer.parseInt(sc.nextLine());
    }
    
    
    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
    
    private int gcd(int a, int b){
        int tmp1 = Math.abs(a), tmp2 = Math.abs(b);
        while(tmp2 > 0) {
            int tmp = tmp1 % tmp2;
            tmp1 = tmp2;
            tmp2 = tmp;
        }
        return tmp1;
    }
    
    public void rutGon() {
        int x = gcd(tuSo, mauSo);
        tuSo /= x;
        mauSo /= x;
        if(tuSo < 0 && mauSo < 0){
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }
    
    
    public PhanSo tinhHieu(PhanSo x){
        int ms = this.mauSo * x.mauSo;
        int ts = this.tuSo * x.mauSo - this.mauSo * x.tuSo;
        PhanSo res = new PhanSo(ts, ms);
        res.rutGon();
        return res;
    }
    
    public PhanSo nhan(PhanSo x) {
        int ms = this.mauSo * x.mauSo;
        int ts = this.tuSo * x.tuSo;
        PhanSo res = new PhanSo(ts, ms);
        res.rutGon();
        return res;
    }
    
    
    public void viet() {
        System.out.println(tuSo + "/" + mauSo);
    }
    
}
