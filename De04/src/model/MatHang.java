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
public class MatHang implements Serializable{
    //(mã hàng, Tên hàng, Nhóm hàng, Giá bán, Số lượng) 
    private int ma;
    private String ten, nhom;
    private double gia;
    private int sl;
    private static int sma = 1000;

    public MatHang() {
    }

    public MatHang(int ma, String ten, String nhom, double gia, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.gia = gia;
        this.sl = sl;
    }

    public MatHang(String ten, String nhom, double gia, int sl) throws TrongException, SoException {
        this.ma = sma++;
        if(ten.isEmpty()) throw new TrongException();
        this.ten = ten;
        this.nhom = nhom;
        this.gia = gia;
        this.sl = sl;
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

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MatHang.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, ten, nhom, gia, sl
        };
    }
}
