/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class QLTB implements Serializable{
    private ThietBi tb;
    private PhongHoc ph;
    private int sl;
    private String tt;

    public QLTB() {
    }

    public QLTB(ThietBi tb, PhongHoc ph, int sl, String tt) {
        this.tb = tb;
        this.ph = ph;
        this.sl = sl;
        this.tt = tt;
    }

    public ThietBi getTb() {
        return tb;
    }

    public void setTb(ThietBi tb) {
        this.tb = tb;
    }

    public PhongHoc getPh() {
        return ph;
    }

    public void setPh(PhongHoc ph) {
        this.ph = ph;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }
    
    public Object[] toObject() {
        return new Object[] {
          ph.getMa(), ph.getTen(), tb.getMa(), tb.getTen(), sl, tt
        };
    }
}
