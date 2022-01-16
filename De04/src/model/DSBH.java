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
public class DSBH implements Serializable{
    private MatHang mh;
    private NhanVien nv;
    private int sl;

    public DSBH() {
    }

    public DSBH(MatHang mh, NhanVien nv, int sl) {
        this.mh = mh;
        this.nv = nv;
        this.sl = sl;
    }

    public MatHang getMh() {
        return mh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    public Object[] toObject() {
        return new Object[] {
           mh.getMa(), mh.getTen(), nv.getMa(), nv.getHoten(), sl
        };
    }
}
