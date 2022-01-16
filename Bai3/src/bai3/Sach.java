/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author DELL
 */
public class Sach extends TaiLieu{
    private String tenTG, tenSach;
    private int soTrang;

    public Sach() {
    }

    public Sach(String ma, String tenNXB, int soBan, String tenTG, String tenSach, int soTrang) {
        super(ma, tenNXB, soBan);
        this.tenTG = tenTG;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.getMa() + "\t" + super.getTenNXB() + "\t" + super.getSoBan() + "\t" + tenTG + "\t" + tenSach + "\t" + soTrang;
    }
}
