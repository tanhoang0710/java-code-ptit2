/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongExcpetion;
import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class BT implements Serializable{
    private CauThu ct;
    private ViTri vt;
    private double tong;

    public BT() {
    }

    public BT(CauThu ct, ViTri vt, int tong) {
        this.ct = ct;
        this.vt = vt;
        this.tong = tong;
    }

    public CauThu getCt() {
        return ct;
    }

    public void setCt(CauThu ct) {
        this.ct = ct;
    }

    public ViTri getVt() {
        return vt;
    }

    public void setVt(ViTri vt) {
        this.vt = vt;
    }

    public double getTong() {
        return tong;
    }

    public void setTong(double tong) {
        this.tong = tong;
    }

    
    
    
    
    public Object[] toObject() {
        return new Object[]{
          ct.getMa(), ct.getTen(), vt.getMa(), vt.getTen(), tong
        };
    }
}
