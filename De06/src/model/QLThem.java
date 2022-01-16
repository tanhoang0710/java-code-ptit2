/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL
 */
public class QLThem {
    private ThietBi tb;
    private PhongHoc ph;

    public QLThem() {
    }

    public QLThem(ThietBi tb, PhongHoc ph) {
        this.tb = tb;
        this.ph = ph;
    }

    public Object[] toObject() {
        return new Object[]{
            tb.getTen(), ph.getMa(), ph.getTen()
        };
    }    
}
