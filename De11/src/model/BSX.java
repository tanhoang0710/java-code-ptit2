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
public class BSX implements Serializable{
    // mã khách hàng, tên khách hàng, loại phòng cần thuê, số phòng cầnthuê
    private Phong p;
    private KhachHang kh;
    private int songay;

    public BSX() {
    }

    public BSX(Phong p, KhachHang kh, int songay) {
        this.p = p;
        this.kh = kh;
        this.songay = songay;
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

    public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }
    
    
    public Object[] toObject() {
        return new Object[] {
          kh.getMa(), kh.getTen(), p.getMa(), p.getKieu(), songay
        };
    }
    
    
}
