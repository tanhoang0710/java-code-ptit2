/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class PhongBan implements Serializable{
    // (mã phòng, tên phòng, mô tả, Hệ số công việc)
    private int ma;
    private String ten, mota;
    private int heSoCV;
    private static int sma = 1000;

    public PhongBan() {
    }

    public PhongBan(String ten, String mota, int heSoCV) throws TrongException {
        this.ma = sma++;
        if(ten.isEmpty()) throw new TrongException();
        this.ten = ten;
        this.mota = mota;
        this.heSoCV = heSoCV;
    }

    public PhongBan(int ma, String ten, String mota, int heSoCV) {
        this.ma = ma;
        this.ten = ten;
        this.mota = mota;
        this.heSoCV = heSoCV;
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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHeSoCV() {
        return heSoCV;
    }

    public void setHeSoCV(int heSoCV) {
        this.heSoCV = heSoCV;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        PhongBan.sma = sma;
    }


    public Object[] toObject() {
        return new Object[] {
            ma, ten, mota, heSoCV
        };
    }
    
}
