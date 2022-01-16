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
    private Lop l;
    private PhongHoc ph;

    public BT() {
    }

    public BT(Lop l, PhongHoc ph) {
        this.l = l;
        this.ph = ph;
    }
    
    

    public Lop getL() {
        return l;
    }

    public void setL(Lop l) {
        this.l = l;
    }

    public PhongHoc getPh() {
        return ph;
    }

    public void setPh(PhongHoc ph) {
        this.ph = ph;
    }
    
    public Object[] toObject() {
        return new Object[] {
            l.getMa(), l.getTen(), ph.getMa(), ph.getTen()
        };
    }
}
