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
public class BHD implements Serializable{
    // mã khách hàng, tên khách hàng, loại phòng cần thuê, số phòng cầnthuê
    private Phong p;
    private KhachHang kh;
    private double tong;

    public BHD() {
    }

    public BHD(Phong p, KhachHang kh, double tong) {
        this.p = p;
        this.kh = kh;
        this.tong = tong;
    }

    public Phong getP() {
        return p;
    }

    public void setP(Phong p) {
        this.p = p;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public double getTong() {
        return tong;
    }

    public void setTong(double tong) {
        this.tong = tong;
    }
    
    public Object[] toObject() {
        return new Object[] {
          kh.getMa(), kh.getTen(), p.getMa(), p.getKieu(), tong
        };
    }
    
    
}
