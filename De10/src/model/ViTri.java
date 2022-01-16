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
public class ViTri implements Serializable{
    private int ma;
    private String ten;
    private double mucthuong;
    private static int sma = 100;

    public ViTri() {
    }

    public ViTri(String ten, double mucthuong) throws TrongExcpetion {
        this.ma = sma++;
        if(ten.isEmpty()) throw new TrongExcpetion();
        this.ten = ten;
        this.mucthuong = mucthuong;
    }

    public ViTri(int ma, String ten, double mucthuong) throws TrongExcpetion {
        this.ma = ma;
        if(ten.isEmpty()) throw new TrongExcpetion();
        this.ten = ten;
        this.mucthuong = mucthuong;
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
    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        ViTri.sma = sma;
    }

    public double getMucthuong() {
        return mucthuong;
    }

    public void setMucthuong(double mucthuong) {
        this.mucthuong = mucthuong;
    }
    
    
    
    public Object[] toObject() {
        return new Object[]{
          ma, ten, mucthuong
        };
    }
}
