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
public class PhongHoc implements Serializable{
    //mã PH, tên phòng, số ghế
    private int ma;
    private String ten;
    private int soGhe;
    private static int sma = 10000;

    public PhongHoc() {
    }

    public PhongHoc(String ten, int soGhe) throws TrongException {
        if(ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.soGhe = soGhe;
    }

    public PhongHoc(int ma, String ten, int soGhe) {
        this.ma = ma;
        this.ten = ten;
        this.soGhe = soGhe;
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

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        PhongHoc.sma = sma;
    }
    
    
    public Object[] toObject() {
        return new Object[]{
          ma, ten, soGhe
        };
    }
}
