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
public class GiangVien implements Comparable<GiangVien>, TinhLuong{
    //  mã giảng viên,tên giảng viên, email, học hàm (không, giáo sư, phó
//giáo sư), học vị (đại học, thạc sĩ, tiến sĩ), địa chỉ, điện thoại, số giờ giảng dạy trong tháng, lương
//thỏa thuận (lương cứng ), hệ số lương (đại học: 1, thạc sĩ 1.1 tiến sĩ 1.2, giáo sư thêm 0.2, phó
//giáo sư 0.1) và số giờ quy định chung trong tháng, vượt giờ được tính 50.000đ/1h.
    private String ma, ten, email, hocHam, hocVi, diaChi, dienThoai;
    private int soGioGiangDay;

    public GiangVien() {
    }

    public GiangVien(String ma, String ten, String email, String hocHam, String hocVi, String diaChi, String dienThoai, int soGioGiangDay) {
        this.ma = ma;
        this.ten = ten;
        this.email = email;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.soGioGiangDay = soGioGiangDay;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public int getSoGioGiangDay() {
        return soGioGiangDay;
    }

    public void setSoGioGiangDay(int soGioGiangDay) {
        this.soGioGiangDay = soGioGiangDay;
    }

    public double getHeSoLuong() {
        if(hocVi.equalsIgnoreCase("Dai hoc")) {
            return 1;
        }else if(hocVi.equalsIgnoreCase("Thac si")){
            return 1.1;
        }else if(hocVi.equalsIgnoreCase("Tien si") && (hocHam.equalsIgnoreCase("Pho giao su"))){
            return 1.3;
        }else if(hocVi.equalsIgnoreCase("Tien si") && (hocHam.equalsIgnoreCase("Giao su"))){
            return 1.4;
        }else if(hocVi.equalsIgnoreCase("Tien si")){
            return 1.2;
        }
        return 1;
    }

//    @Override
//    public String toString() {
//        return ma + "\t" + ten + "\t" + email + "\t" + hocHam + "\t" + hocVi + "\t" + diaChi + "\t" + dienThoai + "\t" + soGioGiangDay + "\t" + heSoLuong;
//    }

    @Override
    public int compareTo(GiangVien o) {
        String tmp1[] = o.getTen().split("\\s++");
        String n1 = tmp1[tmp1.length - 1];
        String tmp2[] = this.getTen().split("\\s++");
        String n2 = tmp2[tmp2.length - 1];
        if(n1.equalsIgnoreCase(n2)) {
            return this.getTen().compareToIgnoreCase(o.getTen());
        }else {
            return n1.compareToIgnoreCase(n2);
        }
    }

    @Override
    public double tongLuong() {
        return soGioGiangDay * getHeSoLuong();
    }
    
    
}
