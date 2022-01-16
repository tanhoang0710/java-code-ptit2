/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

/**
 *
 * @author DELL
 */
public class sinhvien {
    private String ma, ten;
    private int diem;
    private String ngaySinh;

    public sinhvien() {
    }

    public sinhvien(String ma, String ten, int diem, String ngaySinh) {
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return ma + "," + ten + "," + diem + "," + ngaySinh;
    }
    
    
}
