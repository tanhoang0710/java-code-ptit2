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
public class CongNhan implements Serializable{
    private int ma;
    private String ten, diachi, casx;
    private static int sma = 10000;
    private int soLoaiSPMax = 5;

    public CongNhan() {
    }

    public CongNhan(String ten, String diachi, String casx) throws TrongException {
        this.ma = sma++;
        if(ten.isEmpty()) throw new TrongException();
        this.ten = ten;
        this.diachi = diachi;
        this.casx = casx;
    }
    
    public CongNhan(int ma, String ten, String diachi, String casx) throws TrongException {
        this.ma = ma;
        if(ten.isEmpty()) throw new TrongException();
        this.ten = ten;
        this.diachi = diachi;
        this.casx = casx;
    }

    public int getSoLoaiSPMax() {
        return soLoaiSPMax;
    }

    public void setSoLoaiSPMax(int soLoaiSPMax) {
        this.soLoaiSPMax = soLoaiSPMax;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getCasx() {
        return casx;
    }

    public void setCasx(String casx) {
        this.casx = casx;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        CongNhan.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, ten, diachi, casx
        };
    }
}
