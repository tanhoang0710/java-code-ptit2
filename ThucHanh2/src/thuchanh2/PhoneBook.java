/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh2;

import java.util.*;

/**
 *
 * @author DELL
 */
public class PhoneBook implements IChucNang{
    
    private List<Phone> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public PhoneBook() {
        list.add(new Phone("24", "36407515"));
        list.add(new Phone("227", "38212136"));
        list.add(new IntPhone("24", "36407515", "84"));
        list.add(new IntPhone("38", "47634523", "84"));
        list.add(new Phone("24", "36407666"));
        list.add(new IntPhone("38", "47634888", "33"));
    }
    
    private int tonTai(String sdt) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getSoDienThoai().equals(sdt)){
                return i;
            }
        }
        return -1;
    }
    
    public Phone nhap() {
        String maVung, soDienThoai;
        while (true) {            
            System.out.print("Nhap ma vung: ");
            maVung = sc.nextLine();
            if(maVung.length() == 2 || maVung.length() == 3) {
                break;
            }
            System.out.println("Ko dung dinh dang. Nhap lai");
        }
        while (true) {            
            System.out.print("Nhap sdt: ");
            soDienThoai = sc.nextLine();
            if(tonTai(soDienThoai) == -1 && soDienThoai.length() == 8) {
                break;
            }
            System.out.println("Da co sdt");
        }
        return new Phone(maVung, soDienThoai);
    }

    @Override
    public void nhapSDTNoiHat() {
        Phone x = nhap();
        list.add(x);
        System.out.println("Them thanh cong");
    }

    @Override
    public void nhapSDTQuocTe() {
        Phone x = nhap();
        String maQuocGia;
        while (true) {            
            System.out.print("Nhap ma quoc gia: ");
            maQuocGia = sc.nextLine();
            if(maQuocGia.length() == 2) {
                break;
            }
            System.out.println("Ko dung dinh dang. Nhap lai");
        }
        list.add(new IntPhone(x.getMaVung(), x.getSoDienThoai(), maQuocGia));
        System.out.println("Them thanh cong");
    }

    @Override
    public void in() {
        System.out.println("DS toan bo:");
        for (Phone x : list) {
            x.out();
        }
        System.out.println("Tong so: " + list.size());
    }

    @Override
    public void sua() {
        String maVung;
        System.out.println("Nhap so dien thoai: ");
        String sdt = sc.nextLine();
        for (Phone x : list) {
            if(x.getSoDienThoai().equals(sdt)){
                    System.out.print("Nhap ma vung: ");
                    maVung = sc.nextLine();
                    if(maVung.length() == 2) {
                        x.setMaVung(maVung);
                    }
                    else System.out.println("Ko dung dinh dang. Nhap lai");
            }
        }
    }

    @Override
    public void sapXepTheoMaVung() {
        list.sort(new Comparator<Phone>(){
            @Override
            public int compare(Phone o1, Phone o2) {
                return o1.getMaVung().compareTo(o2.getMaVung());
            }
            
        });
        System.out.println("Sap xep thanh cong");
    }

    @Override
    public void duaRaSDT3SoCuoiTrungNhau() {
        System.out.println("DS sdt 3 cso cuoi trung nhau: ");
        for (Phone x : list) {
            if(x.BaSoCuoi() % 111 == 0) {
                x.out();
            }
        }
    }

    @Override
    public void duaRaSDTTheoMaVung() {
        System.out.println("Nhap ma vung:");
        String maVung = sc.nextLine();
        for (Phone x : list) {
            if(x.getMaVung().equals(maVung)){
                x.out();
            }
        }
    }
    
}
