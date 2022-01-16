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
public class BT implements Serializable{
    private NhanVien nv;
    private DuAn da;

    public BT() {
    }

    public BT(NhanVien nv, DuAn da) {
        this.nv = nv;
        this.da = da;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public DuAn getDa() {
        return da;
    }

    public void setDa(DuAn da) {
        this.da = da;
    }
    
    public Object[] toObject() {
        return new Object[] {
          nv.getMa(), nv.getTen(), da.getTen(), da.getMa()
        };
    }
}
