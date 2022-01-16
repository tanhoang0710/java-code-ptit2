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
public class TapChi extends TaiLieu{
    private int soPhatHanh, thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String ma, String tenNXB, int soBan, int soPhatHanh, int thangPhatHanh) {
        super(ma, tenNXB, soBan);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return super.getMa() + "\t" + super.getTenNXB() + "\t" + super.getSoBan() + "\t" + soPhatHanh + "\t" + thangPhatHanh;
    }
    
    
}
