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
public class GiaoDichDat extends GiaoDich{
    private String loaiDat;

    public GiaoDichDat() {
    }

    public GiaoDichDat(String ma, String ngay, int donGia, int soLuong, String loaiDat) {
        super(ma, ngay, donGia, soLuong);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    
    public int getHeSo() {
        if(loaiDat.equals("1"))
            return 200;
        else if(loaiDat.equals("2"))
            return 400;
        else if(loaiDat.equals("3"))
            return 800;
        return 1;
    }

    @Override
    public String toString() {
        return super.getMa() + "\t" + super.getNgay() + "\t" + super.getDonGia() + "\t" + super.getSoLuong() + "\t" + loaiDat + "\t" + thanhTien();
    }
    
    @Override
    public double thanhTien() {
        return super.getSoLuong() * super.getDonGia() * getHeSo();
    }
}
