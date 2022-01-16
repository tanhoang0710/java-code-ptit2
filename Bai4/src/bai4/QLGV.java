/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public class QLGV implements ChucNang{
    
    private List<GiangVien> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public QLGV() {
        list.add(new GiangVienCoHuu("1", "Nguyen Duc Tinh", "tinhnd@", "giao su", "tien si", "QN", "090x", 50, 3000000));
        list.add(new GiangVienCoHuu("2", "Dang Van Cuong", "cuongdv@", "khong", "tien si", "HN", "091x", 32, 5000000));
        list.add(new GiangVienCoHuu("3", "Nguyen Duc Tai", "taind@", "pho giao su", "tien si", "HCM", "093x", 26, 4000000));
        list.add(new GiangVienThinhGiang("4", "Nguyen Phuong Thuy", "thuynp@", "khong", "thac si", "HP", "094x", 55, "PTIT"));
        list.add(new GiangVienThinhGiang("5", "Tran Hoang Tung", "tungth@", "pho giao su", "tien si", "DN", "095x", 15, "ULIS"));
        list.add(new GiangVienThinhGiang("6", "Ngo Lan Huong", "huongnl@", "khong", "dai hoc", "HN", "096x", 28, "FPT"));
        list.add(new GiangVienCoHuu("7", "Nguyen Thi Thom", "thomnt@", "pho giao su", "tien si", "PT", "097x", 42, 4200000));
        list.add(new GiangVienCoHuu("8", "Tran Hoang Tien", "tienth@", "khong", "tien si", "NA", "098x", 39, 3800000));
    }
    
    private int tontai(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    
    private GiangVien nhap() {
        //String ma, String ten, String email, String hocHam, String hocVi, String diaChi, String dienThoai, int soGioGiangDay
        String ma;
        while (true) {            
            System.out.print("Nhap ma: ");
            ma = sc.nextLine();
            if(tontai(ma) == -1) {
                break;
            }
                System.err.println("Ma da co. Nhap lai!!!");
        }
        String ten, email, hocHam, hocVi, diaChi, dienThoai;
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap email: ");
        email = sc.nextLine();
        System.out.print("Hoc ham: ");
        hocHam = sc.nextLine();
        System.out.print("Hoc vi: ");
        hocVi = sc.nextLine();
        System.out.print("Dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Dien thoai: ");
        dienThoai = sc.nextLine();
        System.out.print("So gio giang day: ");
        int soGioGiangDay = Integer.parseInt(sc.nextLine());
        return new GiangVien(ma, ten, email, hocHam, hocVi, diaChi, dienThoai, soGioGiangDay);
    }

    @Override
    public void nhapGiangVienCoHuu() {
        GiangVien x = nhap();
        System.out.print("Nhap luong cung: ");
        int luongCung = Integer.parseInt(sc.nextLine());
        list.add(new GiangVienCoHuu(x.getMa(), x.getTen(), x.getEmail(), x.getHocHam(), x.getHocVi(), x.getDiaChi(), x.getDienThoai(), x.getSoGioGiangDay(), luongCung));
    }

    @Override
    public void nhapGiangVienThinhGiang() {
        GiangVien x = nhap();
        System.out.print("Nhap co quan lam viec: ");
        String coQuanLamViec = sc.nextLine();
        list.add(new GiangVienThinhGiang(x.getMa(), x.getTen(), x.getEmail(), x.getHocHam(), x.getHocVi(), x.getDiaChi(), x.getDienThoai(), x.getSoGioGiangDay(), coQuanLamViec));
    }

    @Override
    public void inDSGV() {
        System.out.println("Danh sach:");
        for (GiangVien x : list) {
            System.out.println(x);
        }
    }

    @Override
    public void xoaGV() {
        String ma;      
        System.out.println("Nhap ma can xoa:");
        ma = sc.nextLine();
        if(tontai(ma) != -1) {System.out.println("Xoa thanh cong!!!");
            list.remove(tontai(ma));
            
        }else {
            System.err.println("Co dau ma xoa!!!");
        }
    }

    @Override
    public void suaGV() {
        String ma;          
        System.out.println("Nhap ma can sua:");
        ma = sc.nextLine();
        if(tontai(ma) != -1) {
            
            if(list.get(tontai(ma)) instanceof GiangVienCoHuu) {
                list.set(tontai(ma), new GiangVienCoHuu(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
            }else if(list.get(tontai(ma)) instanceof GiangVienThinhGiang) {
                list.set(tontai(ma), new GiangVienThinhGiang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine()));
            }
            System.out.println("Sua thanh cong");
        }else {
            System.err.println("Co dau ma sua!!!");
        }
    }

    @Override
    public void inDSGVCH() {
        System.out.println("Danh sach GV Co huu:");
        for (GiangVien x : list) {
            if(x instanceof GiangVienCoHuu) {
                System.out.println(x);
            }
        }
    }

    @Override
    public void inDSGVTG() {
        System.out.println("Danh sach GV thinh giang: ");
        for (GiangVien x : list) {
            if(x instanceof GiangVienThinhGiang) {
                System.out.println(x);
            }
        }
    }

    @Override
    public void timKiemGVGanDung() {
    }

    @Override
    public void sapXepDSTheoHoTen() {
        Collections.sort(list);
        System.out.println("Sap xep thanh cong");
    }

    @Override
    public void sapXepTheoHeSoLuong() {
        list.sort(new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                return Double.compare(o1.getHeSoLuong(), o2.getHeSoLuong());
            }
            
        });
        System.out.println("Sap xep thanh cong");
    }

    @Override
    public void sapXepTheoLuongLinh() {
        list.sort(new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                return Double.compare(o1.tongLuong(), o2.tongLuong());
            }
            
        });
        System.out.println("Sap xep thanh cong");
    }

    @Override
    public void tinhTongLuong() {
        double tong = 0;
        for (GiangVien x : list) {
            tong += x.tongLuong();
        }
        System.out.println("Tong luong la: " + tong);
    }

    @Override
    public void tinhTrungBinhLuong() {
        double tong = 0;
        for (GiangVien x : list) {
            tong += x.tongLuong();
        }
        System.out.println("Trung binh luong la: " + tong / list.size());
    }

    @Override
    public void timGVCoLuongCaoNhat() {
        //Map<Integer, Double> tk = list.stream().collect(Collectors.groupingBy(PTGT::getNam, Collectors.summingDouble(PTGT::getGia)));
//        for (Object key: tk.keySet()) {
//            System.out.println("Nam " + key + ": " + tk.get(key));
//        }
//        Map<String,Double> res = list.stream().collect(Collectors.groupingBy(GiangVien::getMa, Collectors.summingDouble(GiangVien::tongLuong)));
//        for (Object key: res.keySet()) {
//            System.out.println("Giang vien " + key + " co tong luong cao nhat la: " + res.get(key));
//        }
        sapXepTheoLuongLinh();
        System.out.println("Giang vien co luong cao nhat la: " + list.get(list.size() - 1).getTen() + " , luong linh: " + list.get(list.size() - 1).tongLuong());
    }
    
}
