/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SoException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class BPC implements Serializable{
    //mã NV, Họ tên, địa chỉ, chuyên môn
    private NhanVien nv;
    private DuAn da;
    private int soNgayTG;
    private String vitri;

    public BPC() {
    }

    public BPC(NhanVien nv, DuAn da, int soNgayTG, String vitri) {
        this.nv = nv;
        this.da = da;
        this.soNgayTG = soNgayTG;
        this.vitri = vitri;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public DuAn getDa() {
        return da;
    }

    public void setDa(DuAn da) {
        this.da = da;
    }

    public int getSoNgayTG() {
        return soNgayTG;
    }

    public void setSoNgayTG(int soNgayTG) {
        this.soNgayTG = soNgayTG;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }
    
    
    
    public Object[] toObject() {
        return new Object[] {
          nv.getMa(), nv.getTen(), da.getMa(), da.getTen(), soNgayTG, vitri
        };
    }
}
