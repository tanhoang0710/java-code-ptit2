/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public class PhoneBook implements ChucNang{
    // check trung va tim kiem theo duoi
    private List<PhoneNumber> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public PhoneBook() {
    }
    
    private boolean checkSdtTrongNuoc(String maVung) {
        if(maVung.length() == 4 || maVung.length() == 3) return true;
        return false;
    }
    
    private boolean checkSdtQuocTe(String maQuocGia, String maVung, String maNoiVung) {
        return maQuocGia.charAt(0) != '0' && maVung.charAt(0) != '0' && maNoiVung.charAt(0) != '0';
    }

    @Override
    public void themSDT() {    
            System.out.println("Ban muon them SDT trong nuoc hay quoc te ?");
            System.out.println("1. Trong nuoc");
            System.out.println("2. Quoc te");
            
            int choose = Integer.parseInt(sc.nextLine());
            
            switch(choose) {
                case 1:
                    themSDTTrongNuoc();
                    break;
                case 2:
                    themSDTQuocTe();
                    break;
                default:
                    System.err.println("Chi chon trong nuoc hoac quoc te !!!");
            }
    }
    
    private void themSDTTrongNuoc() {
        System.out.println("Nhap so dien thoai trong nuoc");
        String maVung;
        while (true) {
            System.out.print("Nhap ma vung: ");
            maVung = sc.nextLine();
            if(checkSdtTrongNuoc(maVung))
                break;
            System.out.println("Nhap ko dung dinh dang!!!!");
        }
        System.out.print("Nhap noi vung: ");
        String noiVung = sc.nextLine();
        list.add(new PhoneNumber(maVung, noiVung));
        System.out.println("Them SDT trong nuoc thanh cong");
    }
    
    private void themSDTQuocTe() {
        System.out.println("Nhap so dien thoai quoc te");
        String maQuocGia, maVung, noiVung;
        while (true) {
            System.out.print("Nhap ma quoc gia: ");
            maQuocGia = sc.nextLine();
            System.out.print("Nhap ma vung: ");
            maVung = sc.nextLine();
            System.out.print("Nhap noi vung: ");
            noiVung = sc.nextLine();
            if(checkSdtQuocTe(maQuocGia, noiVung, maVung))
                break;
            System.out.println("Nhap ko dung dinh dang!!!!");
        }
        list.add(new IntlPhoneNumber(maVung, noiVung, maQuocGia));
        System.out.println("Them SDT quoc te thanh cong");
    }

    @Override
    public void timSDTTheoVung() {
        System.out.print("Nhap ma vung: ");
        String maVung = sc.nextLine();
        for (PhoneNumber x : list) {
            if(x.getMaVung().equals(maVung) || x.getMaVung().equals("0" + maVung)){
                System.out.println(x);
            }
        }
    }

    @Override
    public void lietKeCacSDT() {
            System.out.println("Ban muon liet ke SDT trong nuoc hay quoc te ?");
            System.out.println("1. Trong nuoc");
            System.out.println("2. Quoc te");
            System.out.println("3. Ca 2");
            
            int choose = Integer.parseInt(sc.nextLine());
            
            switch(choose) {
                case 1:
                    hienThiTrongNuoc();
                    break;
                case 2:
                    hienThiQuocTe();
                    break;
                case 3: 
                    hienThiCa2();
                    break;
                default:
                    System.err.println("Chi chon liet ke trong nuoc hoac quoc te hoac ca 2 !!!");
            }
    }
    
    private void hienThiTrongNuoc() {
        for (PhoneNumber x : list) {
            if(!(x instanceof IntlPhoneNumber)) {
                System.out.println(x);
            }
        }
    }
    
    private void hienThiQuocTe() {
        for (PhoneNumber x : list) {
            if(x instanceof IntlPhoneNumber) {
                System.out.println(x);
            }
        }
    }
    
    private void hienThiCa2() {
        for (PhoneNumber x : list) {
            System.out.println(x);
        }
    }

    @Override
    public void tongSDTTheoTungVung() {
        Map<String, Long> res = list.stream().collect(Collectors.groupingBy(PhoneNumber::getMaVung, Collectors.counting()));
        for (Object key : res.keySet()) {
            System.out.println("Ma vung " + key + " : " + res.get(key));
        }
    }

    @Override
    public void timKiemTheoDuoi() {
    }

    @Override
    public void sapXepSDT() {
        Collections.sort(list);
        System.out.println("Sap xep thanh cong");
    }
    
}
