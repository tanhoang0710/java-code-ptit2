/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.DienThoaiException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class NhanVien implements Serializable{
    // (mã nhân viên, Họ tên, Địa chỉ, Số điện thoại, Bậclương)
    
    private int ma;
    private String hoten, dchi, dt;
    private int bacluong;
    private static int sma = 1000;

    public NhanVien() {
    }

    public NhanVien(String hoten, String dchi, String dt, int bacluong) throws TrongException, DienThoaiException {
        this.ma = sma++;
        if(hoten.isEmpty()) throw new TrongException();
        if(!dt.matches("\\d+")) throw new DienThoaiException();
        this.hoten = hoten;
        this.dchi = dchi;
        this.dt = dt;
        this.bacluong = bacluong;
    }

    public NhanVien(int ma, String hoten, String dchi, String dt, int bacluong) {
        this.ma = sma++;
        this.hoten = hoten;
        this.dchi = dchi;
        this.dt = dt;
        this.bacluong = bacluong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public int getBacluong() {
        return bacluong;
    }

    public void setBacluong(int bacluong) {
        this.bacluong = bacluong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, hoten, dchi, dt, bacluong
        };
    }
}
