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
public class DichVu implements Serializable{
    private int ma;
    private String ten, nhom;
    private double cphi, cuoc;
    private static int sma = 1000;

    public DichVu() {
    }

    public DichVu(String ten, String nhom, double cphi, double cuoc) throws TrongException {
        if(ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.nhom = nhom;
        this.cphi = cphi;
        this.cuoc = cuoc;
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

    public double getCphi() {
        return cphi;
    }

    public void setCphi(double cphi) {
        this.cphi = cphi;
    }

    public double getCuoc() {
        return cuoc;
    }

    public void setCuoc(double cuoc) {
        this.cuoc = cuoc;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        DichVu.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[]{
          ma, ten, nhom, cphi, cuoc
        };
    }
}
