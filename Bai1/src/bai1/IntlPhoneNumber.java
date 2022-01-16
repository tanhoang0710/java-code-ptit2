/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author DELL
 */
public class IntlPhoneNumber extends PhoneNumber{
    private String maQuocGia;

    public IntlPhoneNumber() {
    }

    public IntlPhoneNumber(String maVung, String noiVung, String maQuocGia) {
        super(maVung, noiVung);
        this.maQuocGia = maQuocGia;
    }

    @Override
    public String toString() {
        return maQuocGia + "-" + super.getMaVung() + "-" + super.getNoiVung();
    }

}
