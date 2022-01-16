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
public class GiaoDichTienTe extends GiaoDich{
    private String loaiTien;
    private double tiGia;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(String ma, String ngay, int donGia, int soLuong, String loaiTien, double tiGia) {
        super(ma, ngay, donGia, soLuong);
        this.loaiTien = loaiTien;
        this.tiGia = tiGia;
    }
    
    public GiaoDichTienTe(String ma, String ngay, int donGia, int soLuong, String loaiTien) {
        super(ma, ngay, donGia, soLuong);
        this.loaiTien = loaiTien;
        this.tiGia = 1;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    @Override
    public String toString() {
        return super.getMa() + "\t" + super.getNgay() + "\t" + super.getDonGia() + "\t" + super.getSoLuong() + "\t" + loaiTien + "\t" + tiGia + "\t" + thanhTien();
    }
    
    @Override
    public double thanhTien() {
        if(loaiTien.equalsIgnoreCase("USD") || loaiTien.equalsIgnoreCase("Euro"))
            return super.getSoLuong() * super.getDonGia() * tiGia;
        else if(loaiTien.equalsIgnoreCase("VN"))
            return super.getSoLuong() * super.getDonGia();
        return super.getSoLuong() * super.getDonGia();
    }
}
