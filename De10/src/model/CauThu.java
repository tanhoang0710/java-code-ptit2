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
public class CauThu implements Serializable{
    private int ma;
    private String ten;
    private int tuoi;
    private double mucluong;
    private static int sma = 100;
    private int soVTMax = 3;

    public CauThu() {
    }

    public CauThu(String ten, int tuoi, double mucluong) throws TrongExcpetion {
        this.ma = sma++;
        if(ten.isEmpty()) throw new TrongExcpetion();
        this.ten = ten;
        this.tuoi = tuoi;
        this.mucluong = mucluong;
    }

    public CauThu(int ma, String ten, int tuoi, double mucluong) throws TrongExcpetion {
        this.ma = ma;
        if(ten.isEmpty()) throw new TrongExcpetion();
        this.ten = ten;
        this.tuoi = tuoi;
        this.mucluong = mucluong;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getMucluong() {
        return mucluong;
    }

    public void setMucluong(double mucluong) {
        this.mucluong = mucluong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        CauThu.sma = sma;
    }

    public int getSoVTMax() {
        return soVTMax;
    }

    public void setSoVTMax(int soVTMax) {
        this.soVTMax = soVTMax;
    }
    
    
    
    public Object[] toObject() {
        return new Object[]{
          ma, ten, tuoi, mucluong
        };
    }
}
