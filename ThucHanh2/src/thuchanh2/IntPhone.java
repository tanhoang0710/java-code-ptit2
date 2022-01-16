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
public class IntPhone extends Phone{
    private String maQuocGia;

    public IntPhone() {
    }

    public IntPhone(String maVung, String soDienThoai, String maQuocGia) {
        super(maVung, soDienThoai);
        this.maQuocGia = maQuocGia;
    }

    public String getMaQuocGia() {
        return maQuocGia;
    }

    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }
    
    @Override
    public void out() {
        System.out.println(maQuocGia+ "-" + super.getMaVung() + "-" +super.getSoDienThoai());
    }
}
