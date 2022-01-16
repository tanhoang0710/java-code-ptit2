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
public class BPC implements Serializable{
    private CauThu ct;
    private ViTri vt;
    private int soTran;

    public BPC() {
    }

    public BPC(CauThu ct, ViTri vt, int soTran) {
        this.ct = ct;
        this.vt = vt;
        this.soTran = soTran;
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

    public int getSoTran() {
        return soTran;
    }

    public void setSoTran(int soTran) {
        this.soTran = soTran;
    }
    
    
    
    public Object[] toObject() {
        return new Object[]{
          ct.getMa(), ct.getTen(), vt.getMa(), vt.getTen(), soTran
        };
    }
}
