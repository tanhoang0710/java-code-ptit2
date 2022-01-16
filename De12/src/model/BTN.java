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
public class BTN implements Serializable{
    private CongNhan cn;
    private SanPham sp;
    private double tong;

    public BTN() {
    }

    public BTN(CongNhan cn, SanPham sp, double tong) {
        this.cn = cn;
        this.sp = sp;
        this.tong = tong;
    }

    public CongNhan getCn() {
        return cn;
    }

    public void setCn(CongNhan cn) {
        this.cn = cn;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public double getTong() {
        return tong;
    }

    public void setTong(double tong) {
        this.tong = tong;
    }

    
    
    public Object[] toObject() {
        return new Object[] {
            cn.getMa(), cn.getTen(), sp.getMa(),sp.getTen(), tong
        };
    }
}
