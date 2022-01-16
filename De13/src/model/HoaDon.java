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
    private MatHang mh;
    private int sl;

    public HoaDon() {
    }

    public HoaDon(KhachHang kh, MatHang mh, int sl) {
        this.kh = kh;
        this.mh = mh;
        this.sl = sl;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public MatHang getMh() {
        return mh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    
    
    public Object[] toObject() {
        return new Object[] {
          kh.getMa(), kh.getTen(), mh.getMa(), mh.getTen(), sl
        };
    }
    
}
