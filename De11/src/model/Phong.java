/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class Phong implements Serializable{
    private int ma;
    private String kieu;
    private double muctienthue;
    private int sophong;
    private static int sma= 100;

    public Phong() {
    }

    public Phong(String kieu, double muctienthue, int sophong) {
        this.ma = sma++;
        this.kieu = kieu;
        this.muctienthue = muctienthue;
        this.sophong = sophong;
    }

    public Phong(int ma, String kieu, double muctienthue, int sophong) {
        this.ma = ma;
        this.kieu = kieu;
        this.muctienthue = muctienthue;
        this.sophong = sophong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public double getMuctienthue() {
        return muctienthue;
    }

    public void setMuctienthue(double muctienthue) {
        this.muctienthue = muctienthue;
    }

    public int getSophong() {
        return sophong;
    }

    public void setSophong(int sophong) {
        this.sophong = sophong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Phong.sma = sma;
    }
    
    
    
    public Object[] toObject() {
        return new Object[] {
          ma, kieu, muctienthue, sophong
        };
    }
    
    
}
