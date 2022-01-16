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
public class GiaoDichVang extends GiaoDich{
    private String loaiVang;

    public GiaoDichVang() {
    }

    public GiaoDichVang(String ma, String ngay, int donGia, int soLuong, String loaiVang) {
        super(ma, ngay, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    
    @Override
    public double thanhTien() {
        return super.getSoLuong() * super.getDonGia();
    }

    @Override
    public String toString() {
        return super.getMa() + "\t" + super.getNgay() + "\t" + super.getDonGia() + "\t" + super.getSoLuong() + "\t" + loaiVang + "\t" + thanhTien();
    }
}
