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
    private String ten, dchi, nhom;
    private static int sma = 10000;

    public KhachHang() {
    }

    public KhachHang(String ten, String dchi, String nhom) throws TrongException {
        this.ma = sma++;
        if(ten.isEmpty()) throw new TrongException();
        this.ten = ten;
        this.dchi = dchi;
        this.nhom = nhom;
    }
    
    public KhachHang(int ma, String ten, String dchi, String nhom) throws TrongException {
        this.ma = ma;
        if(ten.isEmpty()) throw new TrongException();
        this.ten = ten;
        this.dchi = dchi;
        this.nhom = nhom;
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

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
          ma, ten, dchi, nhom
        };
    }
    
}
