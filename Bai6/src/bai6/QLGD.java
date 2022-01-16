/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public class QLGD implements ChucNang{
    private List<GiaoDich> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public QLGD() {
        list.add(new GiaoDichDat("1", "24/10/2021", 10, 2, "1"));
        list.add(new GiaoDichDat("2", "15/01/2018", 10, 6, "2"));
        list.add(new GiaoDichDat("3", "25/03/2021", 10, 8, "1"));
        list.add(new GiaoDichDat("4", "27/12/2019", 10, 3, "3"));
        list.add(new GiaoDichDat("5", "19/05/2020", 10, 4, "3"));
        list.add(new GiaoDichTienTe("6", "18/08/2018", 20000, 20, "USD", 1.1));
        list.add(new GiaoDichTienTe("7", "18/08/2018", 50000, 30, "Euro", 1.2));
        list.add(new GiaoDichTienTe("8", "18/08/2018", 10000, 50, "VN"));
        list.add(new GiaoDichVang("9", "26/05/2021", 300, 8, "SJC"));
        list.add(new GiaoDichVang("10", "26/05/2021", 150, 3, "9999"));
    }
    
    private int tonTai(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    
    private GiaoDich nhap(){
        String ma, ngay;
        int donGia, soLuong;
        while (true) {            
            System.out.print("Nhap ma: ");
            ma = sc.nextLine();
            if(tonTai(ma) != -1){
                break;
            }
            System.out.println("Ma da ton tai. Nhap lai !!!");
        }
        System.out.print("Nhap ngay: ");
        ngay = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = Integer.parseInt(sc.nextLine());
        soLuong = Integer.parseInt(sc.nextLine());
        return new GiaoDich(ma, ngay, donGia, soLuong);
    }

    @Override
    public void themGiaoDichTien() {
        GiaoDich x = nhap();
        String loaiTien;
        int tiGia;
        System.out.print("Nhap loai tien (VN, Euro, USD): ");
        loaiTien = sc.nextLine();
        if(loaiTien.equalsIgnoreCase("USD") || loaiTien.equalsIgnoreCase("Euro")){
            System.out.println("Nhap ti gia");
            tiGia = Integer.parseInt(sc.nextLine());
        }else tiGia = 1;
        list.add(new GiaoDichTienTe(x.getMa(), x.getNgay(), x.getDonGia(), x.getSoLuong(), loaiTien, tiGia));
        System.out.println("Them thanh cong");
    }

    @Override
    public void themGiaoDichVang() {
        GiaoDich x = nhap();
        String loaiVang;
        System.out.println("Nhap loai vang: ");
        loaiVang = sc.nextLine();
        list.add(new GiaoDichVang(x.getMa(), x.getNgay(), x.getDonGia(), x.getSoLuong(), loaiVang));
        System.out.println("Them thanh cong");
    }

    @Override
    public void themGiaoDichDat() {
        GiaoDich x = nhap();
        String loaiDat;
        System.out.println("Nhap loai dat(1, 2, 3): ");
        loaiDat = sc.nextLine();
        list.add(new GiaoDichDat(x.getMa(), x.getNgay(), x.getDonGia(), x.getSoLuong(), loaiDat));
        System.out.println("Them thanh cong");
    }

    @Override
    public void inDS() {
        System.out.println("In danh sach:");
        for (GiaoDich x : list) {
            System.out.println(x);
        }
    }

    @Override
    public void sua() {
        String ma;
        System.out.println("Nhap ma can sua: ");
        ma = sc.nextLine();
        if(tonTai(ma) != -1) {
            if(list.get(tonTai(ma)) instanceof GiaoDichDat) {
                list.set(tonTai(ma), new GiaoDichDat(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
            }else if(list.get(tonTai(ma)) instanceof GiaoDichVang) {
                list.set(tonTai(ma), new GiaoDichVang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
            }else if(list.get(tonTai(ma)) instanceof GiaoDichTienTe) {
                list.set(tonTai(ma), new GiaoDichTienTe(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine(), Double.parseDouble(sc.nextLine())));
            }
            System.out.println("Sua thanh cong");
        }else{
            System.out.println("Co dau ma sua");
        }
    }

    @Override
    public void xoa() {
        String ma;
        System.out.println("Nhap ma can xoa: ");
        ma = sc.nextLine();
        if(tonTai(ma) != -1) {
            list.remove(tonTai(ma));
            System.out.println("Xoa thanh cong");
        }else {
            System.out.println("Co dau ma xoa");
        }
    }

    @Override
    public void tongSoGiaoDichCuaMoiLoai() {
        int loaiTienTe = 0, loaiDat = 0, loaiVang = 0;
        for (GiaoDich x : list) {
            if(x instanceof GiaoDichDat) loaiDat++;
            if(x instanceof GiaoDichVang) loaiVang++;
            if(x instanceof GiaoDichTienTe) loaiTienTe++;
        }
        System.out.println("Tong so GD loai tien te: " + loaiTienTe);
        System.out.println("Tong so GD loai dat: " + loaiDat);
        System.out.println("Tong so GD loai vang: " + loaiVang);
    }

    @Override
    public void hienThiDSGiaoDichTheoNgay() {
        Map<String, Long> res = list.stream().collect(Collectors.groupingBy(GiaoDich::getNgayGiaoDich, Collectors.counting()));
        for (Object key: res.keySet()) {
            System.out.println("Ngay" + key + ": " + res.get(key));
        }
    }

    @Override
    public void hienThiDSGiaoDichCoChuaNgay() {
        System.out.println("Nhap ngay: ");
        String ngay = sc.nextLine();
        System.out.println("DS la:");
        for (GiaoDich x : list) {
            if(x.getNgayGiaoDich().equalsIgnoreCase(ngay)){
                System.out.println(x);
            }
        }
    }

    @Override
    public void hienThiDSGiaoDichTuNamDenNam() {
        int nam1, nam2;
        System.out.println("Nhap nam bat dau: ");
        nam1 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap nam ket thuc: ");
        nam2 = Integer.parseInt(sc.nextLine());
        System.out.println("DS la:");
        for (GiaoDich x : list) {
            if(x.getNam() >= nam1 && x.getNam() <= nam2){
                System.out.println(x);
            }
        }
    }
}
