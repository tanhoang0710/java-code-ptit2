/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class KhachHang implements Comparable<KhachHang>{
    private String maKH, hoTen, maPhong;
    private Date ngayDen, ngayDi;

    public KhachHang() {
    }

    public KhachHang(int index, String hoTen, String maPhong, String ngayDen, String ngayDi) {
        this.maKH = "KH" + String.format("%02d", index);
        this.hoTen = hoTen;
        this.maPhong = maPhong;
        try {
            this.ngayDen = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDen);
            this.ngayDi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
    }
    
    public String getTenPhong() {
        return this.maPhong;
    }
    
    public String getMaPhong() {
        return maPhong.substring(2, 3);
    }

    public Date getNgayDen() {
        return ngayDen;
    }

    public Date getNgayDi() {
        return ngayDi;
    }
    
    public long getSoNgayO() {
        long t1 = getNgayDen().getTime();
        long t2 = getNgayDi().getTime();
        if (getNgayDen().equals(getNgayDi())) return 1;
        return TimeUnit.MILLISECONDS.toDays(t2 - t1);
    }
    
    public double getPhanTramGiam() {
        if(getSoNgayO() < 10) return 0;
        else if(getSoNgayO() < 20) return 0.02;
        else if(getSoNgayO() < 30) return 0.04;
        return 0.06;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    @Override
    public int compareTo(KhachHang o) {
        return Long.compare(o.getSoNgayO(), this.getSoNgayO());
    }
    
}
