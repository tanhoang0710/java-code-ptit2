/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

/**
 *
 * @author DELL
 */
public class GiaoDich implements ThanhTien{
    private String ma, ngay;
    private int donGia, soLuong;

    public GiaoDich() {
    }

    public GiaoDich(String ma, String ngay, int donGia, int soLuong) {
        this.ma = ma;
        this.ngay = ngay;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public int getNam() {
        String tmp[] = ngay.split("/");
        return Integer.parseInt(tmp[tmp.length - 1]);
    }
    
    public String getNgayGiaoDich(){
        String tmp[] = ngay.split("/");
        return tmp[0];
    }

    @Override
    public String toString() {
        return ma + "\t" + ngay + "\t" + donGia + "\t" + soLuong;
    }

    @Override
    public double thanhTien() {
        return soLuong * donGia;
    }
}
