/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

public class Fraction {
    private int tuSo;
    private int mauSo;
    
    public Fraction(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
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
    
    public Fraction tinhTong(Fraction x){
        int ms = this.mauSo * x.mauSo;
        int ts = this.tuSo * x.mauSo + this.mauSo * x.tuSo;
        Fraction res = new Fraction(ts, ms);
        res.rutGon();
        return res;
    }
    
    public static Fraction nhan(Fraction x, Fraction y) {
        int ts = x.tuSo * y.tuSo;
        int ms = x.mauSo * y.mauSo;
        Fraction res = new Fraction(ts, ms);
        res.rutGon();
        return res;
    }
    
    public static Fraction nhan(Fraction x, Fraction y, Fraction z) {
        int ts = x.tuSo * y.tuSo * z.tuSo;
        int ms = x.mauSo * y.mauSo * z.mauSo;
        Fraction res = new Fraction(ts, ms);
        res.rutGon();
        return res;
    }
    
    public void viet() {
        System.out.println(tuSo + "/" + mauSo);
    }
}
