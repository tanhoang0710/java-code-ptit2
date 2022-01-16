/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh2;

/**
 *
 * @author DELL
 */
public class Phone implements IViet{
    private String maVung, soDienThoai;

    public Phone() {
    }

    public Phone(String maVung, String soDienThoai) {
        this.maVung = maVung;
        this.soDienThoai = soDienThoai;
    }

    public String getMaVung() {
        return maVung;
    }

    public void setMaVung(String maVung) {
        this.maVung = maVung;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public void out() {
        System.out.println("0" + maVung + "-" +soDienThoai);
    }
    
    public int BaSoCuoi(){
        return Integer.parseInt(soDienThoai.substring(soDienThoai.length() - 3));
    }
}
