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
public class BT implements Serializable{
    private KhachHang kh;
    private DichVu dv;
    private double tien;

    public BT() {
    }

    public BT(KhachHang kh, DichVu dv, double tien) {
        this.kh = kh;
        this.dv = dv;
        this.tien = tien;
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

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }
    public Object[] toObject() {
        return new Object[] {
            kh.getMa(), kh.getTen(), dv.getMa(), dv.getTen(), tien
        };
    }
}
