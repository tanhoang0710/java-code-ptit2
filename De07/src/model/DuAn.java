/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SoException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class DuAn implements Serializable{
    // mã dự án, Tên dự án, Kiểu dự án, Tổng kinh phí)
    private int ma;
    private String ten, kieu, tongkp;
    private static int sma = 10000;

    public DuAn() {
    }

    public DuAn(String ten, String kieu, String tongkp) throws TrongException, SoException {
        if(ten.isEmpty()) throw new TrongException();
        if(!tongkp.matches("\\d+")) throw new SoException();
        this.ma = sma++;
        this.ten = ten;
        this.kieu = kieu;
        this.tongkp = tongkp;
    }

    public DuAn(int ma, String ten, String kieu, String tongkp) {
        this.ma = ma;
        this.ten = ten;
        this.kieu = kieu;
        this.tongkp = tongkp;
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

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public String getTongkp() {
        return tongkp;
    }

    public void setTongkp(String tongkp) {
        this.tongkp = tongkp;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        DuAn.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
          ma, ten, kieu, tongkp
        };
    }
}
