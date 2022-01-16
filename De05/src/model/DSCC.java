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
public class DSCC implements Serializable{
    private NhanVien nv;
    private PhongBan pb;
    private int soNgay;

    public DSCC() {
    }

    public DSCC(NhanVien nv, PhongBan pb, int soNgay) {
        this.nv = nv;
        this.pb = pb;
        this.soNgay = soNgay;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public PhongBan getPb() {
        return pb;
    }

    public void setPb(PhongBan pb) {
        this.pb = pb;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    
    public Object[] toObject() {
        return new Object[] {
            nv.getMa(), nv.getHoten(), pb.getMa(), pb.getTen(), soNgay
        };
    }
}
