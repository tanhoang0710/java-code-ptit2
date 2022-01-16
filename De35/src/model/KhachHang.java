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
public class KhachHang implements Serializable{
    private int ma;
    private String ten, dchi, loai;
    private static int sma = 10000;
    private int sldvmax = 3;

    public KhachHang() {
    }

    public KhachHang(String ten, String dchi, String loai) throws TrongException {
        this.ma = sma++;
        if(ten.isEmpty()) throw new TrongException();
        this.ten = ten;
        this.dchi = dchi;
        this.loai = loai;
    }
    
    public KhachHang(int ma, String ten, String dchi, String loai) throws TrongException {
        this.ma = ma;
        if(ten.isEmpty()) throw new TrongException();
        this.ten = ten;
        this.dchi = dchi;
        this.loai = loai;
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

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
    }

    public int getSldvmax() {
        return sldvmax;
    }

    public void setSldvmax(int sldvmax) {
        this.sldvmax = sldvmax;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, ten, dchi, loai
        };
    }
}
