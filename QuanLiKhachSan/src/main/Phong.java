/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author DELL
 */
public class Phong {
    private String kiHieu, ten;
    private int donGiaNgay;
    private double phiPhucVu;

    public Phong() {
    }

    public Phong(String s) {
        String tmp[] = s.split(" ");
        this.kiHieu = tmp[0];
        this.ten = tmp[1];
        this.donGiaNgay = Integer.parseInt(tmp[2]);
        this.phiPhucVu = Double.parseDouble(tmp[3]);
    }

    public String getKiHieu() {
        return kiHieu;
    }

    public String getTen() {
        return ten;
    }

    public int getDonGiaNgay() {
        return donGiaNgay;
    }

    public double getPhiPhucVu() {
        return phiPhucVu;
    }
    
    
}
