/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author DELL
 */
public class GiangVienThinhGiang extends GiangVien implements TinhLuong{
    private String coQuanLamViec;
    private int tienMoiGio = 200000;

    public GiangVienThinhGiang() {
    }

    public GiangVienThinhGiang(String ma, String ten, String email, String hocHam, String hocVi, String diaChi, String dienThoai, int soGioGiangDay, String coQuanLamViec) {
        super(ma, ten, email, hocHam, hocVi, diaChi, dienThoai, soGioGiangDay);
        this.coQuanLamViec = coQuanLamViec;
    }

    public String getCoQuanLamViec() {
        return coQuanLamViec;
    }

    public void setCoQuanLamViec(String coQuanLamViec) {
        this.coQuanLamViec = coQuanLamViec;
    }

    @Override
    public String toString() {
        return super.getMa() + "\t" + super.getTen() + "\t" + super.getEmail() + "\t" + super.getHocHam() + "\t" + super.getHocVi() + "\t" + super.getDiaChi() + "\t" + 
                super.getDienThoai() + "\t" + super.getSoGioGiangDay() + "\t" + super.getHeSoLuong() + "\t" + coQuanLamViec + "\t" + tongLuong();
    }

    @Override
    public double tongLuong() {
        return super.getSoGioGiangDay() * 200000 * super.getHeSoLuong();
    }

}
