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
public class NhanVien implements Serializable{
    //mã NV, Họ tên, địa chỉ, chuyên môn
    private int ma;
    private String ten, dchi, chuyenmon;
    private static int sma = 10000;

    public NhanVien() {
    }

    public NhanVien(String ten, String dchi, String chuyenmon) throws TrongException {
        this.ma = sma++;
        if(ten.isEmpty()) throw new TrongException();
        this.ten = ten;
        this.dchi = dchi;
        this.chuyenmon = chuyenmon;
    }

    public NhanVien(int ma, String ten, String dchi, String chuyenmon) {
        this.ma = ma;
        this.ten = ten;
        this.dchi = dchi;
        this.chuyenmon = chuyenmon;
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

    public String getChuyenmon() {
        return chuyenmon;
    }

    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
    }
    
    
    
    public Object[] toObject() {
        return new Object[] {
          ma, ten, dchi, chuyenmon
        };
    }
}
