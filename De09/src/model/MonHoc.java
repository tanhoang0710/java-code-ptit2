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
public class MonHoc implements Serializable{
    // mã môn học, Tên môn, Tổng số tiết, Số tiết lý thuyết,mức kinh phí
    private int ma;
    private String ten;
    private int tongSoTiet, soTietLT;
    private double mucKP;
    private static int sma = 100;

    public MonHoc() {
    }

    public MonHoc(String ten, int tongSoTiet, int soTietLT, double mucKP) throws TrongException {
        this.ma = sma++;
        if(ten.isEmpty()) throw new TrongException();
        this.ten = ten;
        this.tongSoTiet = tongSoTiet;
        this.soTietLT = soTietLT;
        this.mucKP = mucKP;
    }

    public MonHoc(int ma, String ten, int tongSoTiet, int soTietLT, double mucKP) {
        this.ma = ma;
        this.ten = ten;
        this.tongSoTiet = tongSoTiet;
        this.soTietLT = soTietLT;
        this.mucKP = mucKP;
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

    public int getTongSoTiet() {
        return tongSoTiet;
    }

    public void setTongSoTiet(int tongSoTiet) {
        this.tongSoTiet = tongSoTiet;
    }

    public int getSoTietLT() {
        return soTietLT;
    }

    public void setSoTietLT(int soTietLT) {
        this.soTietLT = soTietLT;
    }

    public double getMucKP() {
        return mucKP;
    }

    public void setMucKP(double mucKP) {
        this.mucKP = mucKP;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MonHoc.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[]{
            ma, ten, tongSoTiet, soTietLT, mucKP
        };
    }
}
