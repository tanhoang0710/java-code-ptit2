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
public class Lop implements Serializable{
    private int ma;
    private String ten;
    private int soSV;
    private static int sma = 100;

    public Lop() {
    }

    public Lop(String ten, int soSV) throws TrongException {
        if(ten.isEmpty() || (soSV + "").isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.soSV = soSV;
    }

    public Lop(int ma, String ten, int soSV) {
        this.ma = ma;
        this.ten = ten;
        this.soSV = soSV;
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

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Lop.sma = sma;
    }

    
    public Object[] toObject() {
        return new Object[] {
            ma, ten, soSV
        };
    }
}
