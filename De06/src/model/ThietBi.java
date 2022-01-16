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
public class ThietBi implements Serializable{
    // mã TB, Tên, Xuất xứ, Năm sản xuất)
    private int ma;
    private String ten, xuatSu, namsx;
    private static int sma = 10000;

    public ThietBi() {
    }

    public ThietBi(int ma, String ten, String xuatSu, String namsx) {
        this.ma = ma;
        this.ten = ten;
        this.xuatSu = xuatSu;
        this.namsx = namsx;
    }

    public ThietBi(String ten, String xuatSu, String namsx) throws TrongException, SoException {
        if(ten.isEmpty()) throw new TrongException();
        if(!namsx.matches("\\d+")) throw new SoException();
        this.ma = sma++;
        this.ten = ten;
        this.xuatSu = xuatSu;
        this.namsx = namsx;
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

    public String getXuatSu() {
        return xuatSu;
    }

    public void setXuatSu(String xuatSu) {
        this.xuatSu = xuatSu;
    }

    public String getNamsx() {
        return namsx;
    }

    public void setNamsx(String namsx) {
        this.namsx = namsx;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        ThietBi.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[]{
          ma, ten, xuatSu, namsx
        };
    }
}
