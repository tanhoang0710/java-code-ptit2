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
public class QLT implements Serializable{
    // mã môn học, Tên môn, Tổng số tiết, Số tiết lý thuyết,mức kinh phí
    private MonHoc mh;
    private GiangVien gv;
    private double tong;

    public QLT() {
    }
    
    
    public QLT(MonHoc mh, GiangVien gv, double tong) {
        this.mh = mh;
        this.gv = gv;
        this.tong = tong;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public GiangVien getGv() {
        return gv;
    }

    public void setGv(GiangVien gv) {
        this.gv = gv;
    }

    public double getTong() {
        return tong;
    }

    public void setTong(double tong) {
        this.tong = tong;
    }
    
    public Object[] toObject() {
        return new Object[]{
            gv.getMa(), gv.getTen(), mh.getMa(), mh.getTen(), tong
        };
    }
}
