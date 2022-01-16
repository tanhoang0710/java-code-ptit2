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
    private MatHang mh;
    private double tong;

    public BT() {
    }

    public BT(KhachHang kh, MatHang mh, double tong) {
        this.kh = kh;
        this.mh = mh;
        this.tong = tong;
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

    public double getTong() {
        return tong;
    }

    public void setTong(double tong) {
        this.tong = tong;
    }
    
    
    public Object[] toObject() {
        return new Object[] {
          kh.getMa(), kh.getTen(), mh.getMa(), mh.getTen(), tong
        };
    }
    
}
