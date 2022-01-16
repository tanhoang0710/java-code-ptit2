/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.io.Serializable;


/**
 *
 * @author DELL
 */
public class sinhvien implements Serializable{
    private String ma, ten;
    private int diem;
    private int tuoi;

    public sinhvien() {
    }

    public sinhvien(String ma, String ten, int diem, int tuoi) {
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return ma + "," + ten + "," + diem + "," + tuoi;
    }
    
    
}
