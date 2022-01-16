/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiithuchanh2;

import java.util.Calendar;

/**
 *
 * @author DELL
 */
public class XeMay extends PTGT implements TinhGia{
    private double congSuat;

    public XeMay() {
    }

    public XeMay(String ma, String hang, int nam, double gia, String mau, double congSuat) {
        super(ma, hang, nam, gia, mau);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
    
    public double getGia() {
        Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        if(y - super.getNam() > 2){
            return super.getGia() * 0.95;
        }else {
            return super.getGia();
        }
    }
    
    @Override
    public String toString() {
        return getMa() + "\t" + getHang() + "\t" + getNam() + "\t" + getGia() + "\t" + getMau() + "\t" + congSuat;
    }
}
