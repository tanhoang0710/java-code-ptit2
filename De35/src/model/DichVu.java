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
public class DichVu implements Serializable{
    private int ma;
    private String ten, mota;
    private double mucgiacuoc;
    private static int sma = 100;

    public DichVu() {
    }

    public DichVu(String ten, String mota, double mucgiacuoc) throws TrongException {
        this.ma = sma++;
        if(ten.isEmpty()) throw new TrongException();
        this.ten = ten;
        this.mota = mota;
        this.mucgiacuoc = mucgiacuoc;
    }

    public DichVu(int ma, String ten, String mota, double mucgiacuoc) throws TrongException {
        this.ma = ma;
        if(ten.isEmpty()) throw new TrongException();
        this.ten = ten;
        this.mota = mota;
        this.mucgiacuoc = mucgiacuoc;
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

    public double getMucgiacuoc() {
        return mucgiacuoc;
    }

    public void setMucgiacuoc(double mucgiacuoc) {
        this.mucgiacuoc = mucgiacuoc;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        DichVu.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, ten, mota, mucgiacuoc
        };
    }
}
