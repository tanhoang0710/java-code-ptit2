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

    private Tour tr;
    private KhachHang kh;

    public BT() {
    }

    public BT(Tour tr, KhachHang kh, int sl, String tg) {
        this.tr = tr;
        this.kh = kh;
    }
    
    

    public Tour getTr() {
        return tr;
    }

    public void setTr(Tour tr) {
        this.tr = tr;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }
    
    
    public Object[] toObject() {
        return new Object[] {
          kh.getMa(), kh.getTen(), tr.getMa(), tr.getKieu()
        };
    }
    
}
