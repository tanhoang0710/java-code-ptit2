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
public class BTC implements Serializable{
    private CongNhan cn;
    private SanPham sp;
    private int sl;

    public BTC() {
    }

    public BTC(CongNhan cn, SanPham sp, int sl) {
        this.cn = cn;
        this.sp = sp;
        this.sl = sl;
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

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    
    
    public Object[] toObject() {
        return new Object[] {
            cn.getMa(), cn.getTen(), sp.getMa(),sp.getTen(), sl
        };
    }
}
