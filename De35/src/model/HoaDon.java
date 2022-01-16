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
public class HoaDon implements Serializable{
    private KhachHang kh;
    private DichVu dv;
    private int dl;

    public HoaDon() {
    }

    public HoaDon(KhachHang kh, DichVu dv, int dl) {
        this.kh = kh;
        this.dv = dv;
        this.dl = dl;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public DichVu getDv() {
        return dv;
    }

    public void setDv(DichVu dv) {
        this.dv = dv;
    }

    public int getDl() {
        return dl;
    }

    public void setDl(int dl) {
        this.dl = dl;
    }
    
    
    public Object[] toObject() {
        return new Object[] {
            kh.getMa(), kh.getTen(), dv.getMa(), dv.getTen(), dl
        };
    }
}
