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
public class TaiLieu implements Comparable<TaiLieu>{
    private String ma, tenNXB;
    private int soBan;

    public TaiLieu() {
    }

    public TaiLieu(String ma, String tenNXB, int soBan) {
        this.ma = ma;
        this.tenNXB = tenNXB;
        this.soBan = soBan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    @Override
    public int compareTo(TaiLieu o) {
        // sap xep theo ten NXB
//        if(this.getTenNXB().compareToIgnoreCase(o.getTenNXB()) > 0) return 1;
//        else return -1;
        
        // sap xep theo so ban phat hanh
//        if(this.getSoBan() > o.getSoBan()) return 1;
//        else return -1;
        // sap xep theo ten tac gia
        if(this instanceof Sach && o instanceof Sach) {
            if(((Sach)this).getTenTG().compareToIgnoreCase(((Sach)o).getTenTG()) > 0) return 1;
            else return -1;
        }
        else return 1;
    }
}
