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
public class KKGD implements Serializable{
    // mã môn học, Tên môn, Tổng số tiết, Số tiết lý thuyết,mức kinh phí
    private MonHoc mh;
    private GiangVien gv;
    private int solop;
    private int slmax = 3;

    public KKGD() {
    }

    public KKGD(MonHoc mh, GiangVien gv, int solop) {
        this.mh = mh;
        this.gv = gv;
        this.solop = solop;
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

    public int getSolop() {
        return solop;
    }

    public void setSolop(int solop) {
        this.solop = solop;
    }

    public int getSlmax() {
        return slmax;
    }

    public void setSlmax(int slmax) {
        this.slmax = slmax;
    }
    
    
    
    public Object[] toObject() {
        return new Object[]{
            gv.getMa(), gv.getTen(), mh.getMa(), mh.getTen(), solop
        };
    }
}
