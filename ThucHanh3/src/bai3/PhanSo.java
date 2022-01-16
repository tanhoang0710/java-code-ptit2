/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

public class PhanSo {
    private long tuSo;
    private long mauSo;
    
    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }


    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
    
    private long gcd(long a, long b){
        long tmp1 = Math.abs(a), tmp2 = Math.abs(b);
        while(tmp2 > 0) {
            long tmp = tmp1 % tmp2;
            tmp1 = tmp2;
            tmp2 = tmp;
        }
        return tmp1;
    }
    
    public void rutGon() {
        long x = gcd(tuSo, mauSo);
        tuSo /= x;
        mauSo /= x;
        if(tuSo < 0 && mauSo < 0){
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }
    
    public PhanSo tinhTong(PhanSo x){
        long ms = this.mauSo * x.mauSo;
        long ts = this.tuSo * x.mauSo + this.mauSo * x.tuSo;
        PhanSo res = new PhanSo(ts, ms);
        res.rutGon();
        return res;
    }
    
    public PhanSo tinhHieu(PhanSo x){
        long ms = this.mauSo * x.mauSo;
        long ts = this.tuSo * x.mauSo - this.mauSo * x.tuSo;
        PhanSo res = new PhanSo(ts, ms);
        res.rutGon();
        return res;
    }
    
    public void viet() {
        System.out.println(tuSo + "/" + mauSo);
    }
}
