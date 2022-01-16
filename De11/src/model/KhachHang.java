/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongExcpetion;
import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class KhachHang implements Serializable{
    // mã khách hàng, tên khách hàng, loại phòng cần thuê, số phòng cầnthuê
    private int ma;
    private String ten;
    private String loai;
    private int sophongcanthue;
    private static int sma = 100;

    public KhachHang() {
    }

    public KhachHang(String ten, String loai, int sophongcanthue) throws TrongExcpetion {
        this.ma = sma++;
        if(ten.isEmpty()) throw new TrongExcpetion();
        if(loai.isEmpty()) throw new TrongExcpetion();
        this.ten = ten;
        this.loai = loai;
        this.sophongcanthue = sophongcanthue;
    }

    public KhachHang(int ma, String ten, String loai, int sophongcanthue) throws TrongExcpetion {
        this.ma = ma;
        if(ten.isEmpty()) throw new TrongExcpetion();
        if(loai.isEmpty()) throw new TrongExcpetion();
        this.ten = ten;
        this.loai = loai;
        this.sophongcanthue = sophongcanthue;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSophongcanthue() {
        return sophongcanthue;
    }

    public void setSophongcanthue(int sophongcanthue) {
        this.sophongcanthue = sophongcanthue;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
    }
    
    
    
    
    public Object[] toObject() {
        return new Object[] {
          ma, ten, loai, sophongcanthue
        };
    }
    
    
}
