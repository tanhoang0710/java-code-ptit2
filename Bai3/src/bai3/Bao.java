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
public class Bao extends TaiLieu{
    private int ngayPhatHanh;

    public Bao() {
    }

    public Bao(String ma, String tenNXB, int soBan, int ngayPhatHanh) {
        super(ma, tenNXB, soBan);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return super.getMa() + "\t" + super.getTenNXB() + "\t" + super.getSoBan() + "\t" + ngayPhatHanh;
    }
    
    
}
