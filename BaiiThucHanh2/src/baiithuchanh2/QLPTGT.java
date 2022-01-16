/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiithuchanh2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public class QLPTGT implements ChucNang{
    
    private List<PTGT> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public QLPTGT() {
        list.add(new Oto("HN876", "yaris", 2021, 800000, "do", "cho nu", 4));
        list.add(new XeMay("HN321", "Vision", 2014, 38000, "bac", 150));
        list.add(new XeMay("HN881", "spacy", 2000, 10000, "trang", 200));
        list.add(new Oto("HN111", "kia morning", 2000, 120000, "do", "cho nu", 7));
        list.add(new Oto("HN999", "civic", 2012, 900000, "bac", "cho nu", 16));
        list.add(new Oto("HN666", "yaris", 2006, 30000, "xanh", "cho nu", 7));
        list.add(new Oto("HN111", "kia morning", 2000, 20000, "do", "cho nu", 7));
        list.add(new Oto("HN111", "kia morning", 2000, 120000, "do", "cho nu", 7));
    }
    
    private int tonTai(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma)){
                return i;
            }
        }
        return -1;
    }
    
    private PTGT nhap() {
        String reg = "^HN\\d{3}";
        String ma;
        while(true) {
            System.out.print("Ma: ");
            ma = sc.nextLine();
            if(ma.matches(reg) && tonTai(ma) == -1) {
                break;
            }
            System.err.println("Nhap lai!!!");
        }
        System.out.print("Hang: ");
        String hang = sc.nextLine();
        
        System.out.print("Nam: ");
        int nam = Integer.parseInt(sc.nextLine());
        
        System.out.print("Gia: ");
        double gia = Double.parseDouble(sc.nextLine());
        
        System.out.print("Mau: ");
        String mau = sc.nextLine();
        
        return new PTGT(ma, hang, nam, gia, mau);
    }

    @Override
    public void nhapOto() {
        PTGT p = nhap();
        
        System.out.print("Kieu: ");
        String kieu = sc.nextLine();
        
        System.out.print("So Cho: ");
        int soCho = Integer.parseInt(sc.nextLine());
        
        list.add(new Oto(p.getMa(), p.getHang(), p.getNam(), p.getGia(), p.getMau(), kieu, soCho));
    }

    @Override
    public void nhapXeMay() {   
        PTGT p = nhap();
        
        System.out.print("Cong Suat: ");
        double congSuat = Double.parseDouble(sc.nextLine());
        
        list.add(new XeMay(p.getMa(), p.getHang(), p.getNam(), p.getGia(), p.getMau(), congSuat));
    }

    @Override
    public void vietDS() {
        System.out.println("DS Oto");
        for (PTGT x : list) {
            if(x instanceof Oto){
                System.out.println(x);
            }
        }
        System.out.println("DS Xe may");
        for (PTGT x : list) {
            if(x instanceof XeMay){
                System.out.println(x);
            }
        }
    }

    @Override
    public void xoa() {
        System.out.println("Nhap ma can xoa:");
        String ma = sc.nextLine();
        if(tonTai(ma) != -1) {
            System.out.println("Xoa thanh cong!!!");
            list.remove(tonTai(ma));
        }else {
            System.out.println("Co dau ma xoa");
        }
    }

    @Override
    public void sua() {
        System.out.println("Nhap ma can sua:");
        String ma = sc.nextLine();
        if(tonTai(ma) != -1) {
            PTGT x = list.set(tonTai(ma), new Oto(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
            System.out.println("Sua thanh cong!!!");
        }else {
            System.out.println("Co dau ma sua");
        }
    }

    @Override
    public void timTheoMa() {
        System.out.println("Nhap ma can tim:");
        String ma = sc.nextLine();
        boolean check = false;
        if(tonTai(ma) == -1){
            System.out.println("Ko co !!");
        }else {
            System.out.println(list.get(tonTai(ma)));
        }
    }

    @Override
    public void timTheoHang() {
        System.out.print("Nhap hang: ");
        String hang =  sc.nextLine();
        for (PTGT x : list) {
            if(x.getHang().equalsIgnoreCase(hang)){
                System.out.println(x);
            }
        }
    }

    @Override
    public void timTheoNam() {
        System.out.print("Nhap nam 1: ");
        int nam1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap nam 2: ");
        int nam2 = Integer.parseInt(sc.nextLine());
        for (PTGT x : list) {
            if(x.getNam() >= nam1 && x.getNam() <= nam2){
                System.out.println(x);
            }
        }
    }

    @Override
    public void timTheoGiaCao() {
        int gia = Integer.parseInt(sc.nextLine());
        for (PTGT x : list) {
            if(x.getGia()>= gia){
                System.out.println(x);
            }
        }
    }

    @Override
    public void timTheoSoCho() {
        int soCho = Integer.parseInt(sc.nextLine());
        for (PTGT x : list) {
            if(x instanceof Oto){
                if(((Oto) x).getSc() >= soCho){
                    System.out.println(x);
                }
            }
        }
    }

    @Override
    public void sapXepTheoMa() {
        Collections.sort(list);
        System.out.println("Sap xep thanh cong");
    }

    @Override
    public void sapXepTheoSoCho() {
    }

    @Override
    public void sapXepTheoNam() {
    }

    @Override
    public void sapXepOtoTheoSoCho() {
        List<Oto> l = new ArrayList<>();
        for (PTGT i : list) {
            if(i instanceof Oto) {
                l.add((Oto)i);
            }
        }
        l.sort(new Comparator<Oto>() {
            @Override
            public int compare(Oto o1, Oto o2) {
                return o1.getSc() - o2.getSc();
            }
            
        });
        System.out.println("DS oto");
        for (Oto i : l) {
            System.out.println(i);
        }
    }
    
    @Override
    public void sapXepXemayTheoCongSuat() {
        List<XeMay> l = new ArrayList<>();
        for (PTGT x : list) {
            if(x instanceof XeMay){
                l.add((XeMay)x);
            }
        }
        l.sort(new Comparator<XeMay>() {
            @Override
            public int compare(XeMay o1, XeMay o2) {
                return Double.compare(o1.getCongSuat(), o2.getCongSuat());
            }
            
        });
        for (XeMay i : l) {
            System.out.println(i);
        }
    }

    @Override
    public void sapXepTheoGiaNam() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapXepTheoMauVaGia() {
        // mau giam - gia tang
        list.sort(new Comparator<PTGT>() {
            @Override
            public int compare(PTGT o1, PTGT o2) {
                if(o1.getMau().equals(o2.getMau()))
                    return Double.compare(o1.getGia(), o2.getGia());
                else 
                    return o1.getMau().compareTo(o2.getMau());
            }
            
        });
    }

    @Override
    public void thongKe() {
        // theo mau
//        Map<String, Long> tk = list.stream().collect(Collectors.groupingBy(PTGT::getMau, Collectors.counting()));
//        for (Object key: tk.keySet()) {
//            System.out.println("Mau " + key + ": so luong " + tk.get(key));
//        }
        // theo tong gia tung nam
        Map<Integer, Double> tk = list.stream().collect(Collectors.groupingBy(PTGT::getNam, Collectors.summingDouble(PTGT::getGia)));
        for (Object key: tk.keySet()) {
            System.out.println("Nam " + key + ": " + tk.get(key));
        }
        // pTGT dat nhat
//        Optional<PTGT> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(PTGT::getGia)));
//        System.out.println(max.isPresent() ? max.get() : "DS rong");
//        
//        // max - min theo mau
//        Map<String, PTGT> res = 
//                list.stream().collect(Collectors.groupingBy(PTGT::getMau, Collectors.collectingAndThen(
//                        Collectors.reducing((PTGT p1, PTGT p2) -> p1.getGia() > p2.getGia() ? p1 : p2), Optional::get)));
//        for(Object key:  res.keySet()){
//            System.out.println("Mau " + key + " max : " + res.get(key));
//        }
        
//        Map<Boolean, Long> res = list.stream().collect(Collectors.groupingBy(SinhVien::GioiTinh, Collectors.counting()));
//        for (Object key: tk.keySet()) {
//            System.out.println("Nam " + key + ": " + tk.get(key));
//        }
            // Diem cao nhat theo thang của ngày sinh
//            public int thang() {
//    String[] thang = this.nsinh.split("/");
//    return Integer.parseInt(parts[1]);
//}
//
//public void diemCaoTheoThang() {
//    Map<Integer, SinhVien> o = list.stream().collect(Collectors.groupingBy(
//        SinhVien::getThang,
//        Collectors.collectingAndThen(
//            Collectors.reducing(
//                (SinhVien s1, SinhVien s2) -> s1.getDiem() > s2.getDiem() ? s1 : s2,
//                Optional::get
//            )
//        )
//    ));
//    o.forEach((K, V) -> System.out.println(K + ":" + V));
//}

            
    }

    
    // sv; ma ho ten ngay sinh
}
