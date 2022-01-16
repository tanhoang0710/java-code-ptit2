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
public class PhoneNumber implements Comparable<PhoneNumber>{
    private String maVung, noiVung;

    public PhoneNumber() {
    }

    public PhoneNumber(String maVung, String noiVung) {
        this.maVung = maVung;
        this.noiVung = noiVung;
    }

    public String getMaVung() {
        return maVung;
    }

    public void setMaVung(String maVung) {
        this.maVung = maVung;
    }

    public String getNoiVung() {
        return noiVung;
    }

    public void setNoiVung(String noiVung) {
        this.noiVung = noiVung;
    }

    @Override
    public String toString() {
        return  maVung + "-" + noiVung;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        return this.getNoiVung().compareTo(o.getNoiVung());
    }
    
    
}
