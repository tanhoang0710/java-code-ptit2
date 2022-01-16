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
public class QLMuon implements Serializable{
    private BanDoc bandoc;
    private Sach sach;
    private int sluong;
    private String ttrang;

    public QLMuon() {
    }

    public QLMuon(BanDoc bandoc, Sach sach, int sluong, String ttrang) {
        this.bandoc = bandoc;
        this.sach = sach;
        this.sluong = sluong;
        this.ttrang = ttrang;
    }

    public BanDoc getBandoc() {
        return bandoc;
    }

    public void setBandoc(BanDoc bandoc) {
        this.bandoc = bandoc;
    }
    
    public String getMaVaTen() {
        return bandoc.getMa() + " " + bandoc.getHoTen();
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public int getSluong() {
        return sluong;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }

    public String getTtrang() {
        return ttrang;
    }

    public void setTtrang(String ttrang) {
        this.ttrang = ttrang;
    }
    
    public Object[] toObject() {
        return new Object[]{
            bandoc.getMa(), bandoc.getHoTen(), sach.getMa(),
            sach.getTen(), sluong, ttrang
        };
    }
}
