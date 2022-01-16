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
public class GiangVienCoHuu extends GiangVien implements TinhLuong{
    private int luongCung;
    private int soGioQuyDinh = 40;
    private int tienVuotGio = 50000;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(String ma, String ten, String email, String hocHam, String hocVi, String diaChi, String dienThoai, int soGioGiangDay, int luongCung) {
        super(ma, ten, email, hocHam, hocVi, diaChi, dienThoai, soGioGiangDay);
        this.luongCung = luongCung;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    @Override
    public String toString() {
        return super.getMa() + "\t" + super.getTen() + "\t" + super.getEmail() + "\t" + super.getHocHam() + "\t" + super.getHocVi() + "\t" + super.getDiaChi() + "\t" + super.getDienThoai() + "\t" + super.getSoGioGiangDay() + "\t" + super.getHeSoLuong() + "\t" 
                + luongCung + "\t" + tongLuong();
    }

    @Override
    public double tongLuong() {
        if(super.getSoGioGiangDay() > soGioQuyDinh) {
            return (super.getSoGioGiangDay() - soGioQuyDinh) * 50000 + luongCung * super.getHeSoLuong();
        }else return luongCung * super.getHeSoLuong();
    }

}
