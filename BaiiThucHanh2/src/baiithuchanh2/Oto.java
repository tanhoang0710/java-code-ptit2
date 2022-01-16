/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiithuchanh2;

import java.util.Calendar;

/**
 *
 * @author DELL
 */
public class Oto extends PTGT implements TinhGia{
    private String kieu;
    private int sc;

    public Oto() {
    }

    public Oto(String ma, String hang, int nam, double gia, String mau, String kieu, int sc) {
        super(ma, hang, nam, gia, mau);
        this.kieu = kieu;
        this.sc = sc;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public int getSc() {
        return sc;
    }

    public void setSc(int sc) {
        this.sc = sc;
    }
    
    public double getGia() {
        Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        if(y - super.getNam() > 2){
            return super.getGia() * 0.85;
        }else {
            return super.getGia();
        }
    }

    @Override
    public String toString() {
        return getMa() + "\t" + getHang() + "\t" + getNam() + "\t" + getGia() + "\t" + getMau() + "\t" + kieu + "\t" + sc;
    }
    
    
}
