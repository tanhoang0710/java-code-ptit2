/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.*;

/**
 *
 * @author DELL
 */
public class QLTL implements ChucNang{
    private List<TaiLieu> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public QLTL() {
        list.add(new Sach("s005", "Kim Dong", 10, "To Hoai", "De men phieu luu ki", 195));
        list.add(new TapChi("tc002", "Elle", 20, 1, 6));
        list.add(new Sach("s003", "Giao duc", 1000, "Tran Van Hao", "Giai tich 12", 160));
        list.add(new Bao("b002", "Tuoi tre", 60, 25));
        list.add(new Sach("s002", "Tre", 50, "Bui Chi Vinh", "Ngu quai Sai Gon", 248));
        list.add(new Bao("b003", "Nhan dan", 30, 18));
        list.add(new Sach("s004", "Hoi Nha van", 15, "Le Thi Phu Sa", "Tinh khuc mua", 80));
        list.add(new TapChi("tc001", "Vouge", 12, 15, 3));
        list.add(new Sach("s001", "Giao thong van tai", 120, "Pham Gia Nghi", "Nguoi lai xe Oto phai biet", 120));
        list.add(new Bao("b001", "Bong da", 130, 28));
        list.add(new Sach("s006", "a", 10, "a", "a", 195));
        
    }
    
    private int tonTai(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    
    private TaiLieu nhap() {
        String ma;
        while (true) {            
            System.out.print("Nhap ma: ");
            ma = sc.nextLine();
            if(tonTai(ma) == -1) {
                break;
            }
            System.err.println("Ma da co. Nhap lai");
        }
        System.out.print("Nhap ten NXB: ");
        String tenNXB = sc.nextLine();
        System.out.print("Nhap so ban: ");
        int soBan = Integer.parseInt(sc.nextLine());
        return new TaiLieu(ma, tenNXB, soBan);
    }
    
    private Sach newSach() {
        TaiLieu t = nhap();
        System.out.print("Nhap ten tac gia: ");
        String tenTG = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();
        System.out.println("Nhap so trang: ");
        int soTrang = Integer.parseInt(sc.nextLine());
        return new Sach(t.getMa(), t.getTenNXB(), t.getSoBan(), tenTG, tenSach, soTrang);
    }

    @Override
    public void nhapSach() {
        Sach sach = newSach();
        list.add(sach);
        System.out.println("Thanh cong!!!!");
    }
    
    private TapChi newTapChi() {
        TaiLieu t = nhap();
        System.out.print("Nhap so phat hanh: ");
        int soPhatHanh = Integer.parseInt(sc.nextLine());
        int thangPhatHanh;
        while (true) {            
            System.out.print("Nhap thang phat hanh: ");
            thangPhatHanh = Integer.parseInt(sc.nextLine());
            if(thangPhatHanh >= 1 && thangPhatHanh <= 12) {
                break;
            }
            System.err.println("Thang ko dung. Nhap lai!!!");
        }
        return new TapChi(t.getMa(), t.getTenNXB(), t.getSoBan(), soPhatHanh, thangPhatHanh);
    }

    @Override
    public void nhapTapChi() {
        TapChi tc = newTapChi();
        list.add(tc);
        System.out.println("Thanh cong!!!!");
    }
    
    private Bao newBao() {
        TaiLieu t = nhap();
        int ngayPhatHanh;
        while (true) {            
            System.out.print("Nhap ngay phat hanh: ");
            ngayPhatHanh = Integer.parseInt(sc.nextLine());
            if(ngayPhatHanh >= 1 && ngayPhatHanh <= 31) {
                break;
            }
            System.err.println("Ngay khong dung. Nhap lai!!!");
        }
        return new Bao(t.getMa(), t.getTenNXB(), t.getSoBan(), ngayPhatHanh);
    }

    @Override
    public void nhapBao() {
        Bao b = newBao();
        list.add(b);
        System.out.println("Thanh cong!!!!");
    }

    @Override
    public void in() {
        System.out.println("Danh sach tai lieu:");
        for (TaiLieu x : list) {
            System.out.println(x);
        }
        System.out.println("Tong so tai lieu: " + list.size());
    }

    @Override
    public void timKiemTheoMa() {
        System.out.print("Nhap ma can tim kiem: ");
        String ma = sc.nextLine();
        if(tonTai(ma) != -1){
            System.out.println(list.get(tonTai(ma)));
        }else {
            System.out.println("Khong co ma can tim");
        }
    }

    @Override
    public void timKiemTheoTenNXB() {
        System.out.print("Nhap ten nha xuat ban: ");
        String tenNXB = sc.nextLine();
        boolean check = false;
        for (TaiLieu x : list) {
            if(x.getTenNXB().equalsIgnoreCase(tenNXB)){
                System.out.println(x);
                check = true;
            }
        }
        if(!check) System.out.println("Khong tim thay");
    }

    @Override
    public void timKiemTheoTenTacGia() {
        System.out.print("Nhap ten tac gia: ");
        String tenTG = sc.nextLine();
        boolean check = false;
        for (TaiLieu x : list) {
            if( x instanceof  Sach) {
                Sach sach = (Sach)x;
                if(sach.getTenTG().equalsIgnoreCase(tenTG)){
                    System.out.println(sach);
                    check =true;
                }
            }
            
        }
        if(!check) System.out.println("Khong tim thay");
    }

    @Override
    public void timKiemTheoTenSach() {
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();
        boolean check = false;
        for (TaiLieu x : list) {
            if(x instanceof  Sach) {
                Sach sach = (Sach)x;
                if(sach.getTenSach().equalsIgnoreCase(tenSach)){
                    System.out.println(sach);
                    check = true;
                }
            }
            
        }
        if(!check) System.out.println("Khong tim thay");
    }

    @Override
    public void timKiemTheoNgayPhatHanh() {
        int ngayPhatHanh;
        while (true) {            
            System.out.print("Nhap ngay phat hanh: ");
            ngayPhatHanh = Integer.parseInt(sc.nextLine());
            if(ngayPhatHanh >= 1 && ngayPhatHanh <= 31) {
                break;
            }
            System.err.println("Ngay khong dung. Nhap lai!!!");
        }
        boolean check = false;
        for (TaiLieu x : list) {
            if (x instanceof Bao) {
                Bao bao = (Bao)x;
                if(bao.getNgayPhatHanh() == ngayPhatHanh) {
                    System.out.println(bao);
                    check = true;
                }
            }
            
        }
        if(!check) System.out.println("Khong tim thay");
    }

    @Override
    public void timKiemTheoTuThangDenThang() {
        int thangPhatHanh1;
        while (true) {            
            System.out.print("Nhap thang phat hanh: ");
            thangPhatHanh1 = Integer.parseInt(sc.nextLine());
            if(thangPhatHanh1 >= 1 && thangPhatHanh1 <= 12) {
                break;
            }
            System.err.println("Thang ko dung. Nhap lai!!!");
        }
        int thangPhatHanh2;
        while (true) {            
            System.out.print("Nhap thang phat hanh: ");
            thangPhatHanh2 = Integer.parseInt(sc.nextLine());
            if(thangPhatHanh2 >= 1 && thangPhatHanh2 <= 12) {
                break;
            }
            System.err.println("Thang ko dung. Nhap lai!!!");
        }
        boolean check = false;
        for (TaiLieu x : list) {
            if(x instanceof TapChi) {
                TapChi tapChi = (TapChi)x;
                if(tapChi.getThangPhatHanh() >= thangPhatHanh1 && tapChi.getThangPhatHanh() <= thangPhatHanh2) {
                    System.out.println(tapChi);
                    check = true;
                }
            }
            
        }
        if(!check) System.out.println("Khong tim thay");
        
    }

    @Override
    public void timKiemTheoTuNgayDenNgay() {
        int ngayPhatHanh1;
        while (true) {            
            System.out.print("Nhap ngay phat hanh: ");
            ngayPhatHanh1 = Integer.parseInt(sc.nextLine());
            if(ngayPhatHanh1 >= 1 && ngayPhatHanh1 <= 31) {
                break;
            }
            System.err.println("Ngay khong dung. Nhap lai!!!");
        }
        int ngayPhatHanh2;
        while (true) {            
            System.out.print("Nhap ngay phat hanh: ");
            ngayPhatHanh2 = Integer.parseInt(sc.nextLine());
            if(ngayPhatHanh2 >= 1 && ngayPhatHanh2 <= 31) {
                break;
            }
            System.err.println("Ngay khong dung. Nhap lai!!!");
        }
        boolean check = false;
        for (TaiLieu x : list) {
            if(x instanceof Bao) {
                Bao bao = (Bao)x;
                if(bao.getNgayPhatHanh() >= ngayPhatHanh1 && bao.getNgayPhatHanh() <= ngayPhatHanh2) {
                    System.out.println(bao);
                    check = true;
                }
            }
            
        }
        if(!check) System.out.println("Khong tim thay");
    }

    @Override
    public void timKiemTheoTuTrangDenTrang() {
        int trang1, trang2;
        System.out.print("Nhap so trang: ");
        trang1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so trang: ");
        trang2 = Integer.parseInt(sc.nextLine());
        boolean check = false;
        for (TaiLieu x : list) {
            if( x instanceof  Sach) {
                Sach sach = (Sach)x;
                if(sach.getSoTrang() >= trang1 && sach.getSoTrang() <= trang2){
                    System.out.println(sach);
                    check = true;
                }
            }
            
        }
        if(!check) System.out.println("Khong tim thay");
    }

    @Override
    public void timKiemTheoSoBanPhatHanh() {
        int soBan1;
        int soBan2;
        System.out.print("Nhap so ban: ");
        soBan1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so ban: ");
        soBan2 = Integer.parseInt(sc.nextLine());
        boolean check = false;
        for (TaiLieu x : list) {
            if(x.getSoBan() >= soBan1 && x.getSoBan() <= soBan2) {
                System.out.println(x);
                check = true;
            }
        }
        if(!check) System.out.println("Khong tim thay");
    }

    @Override
    public void xoa() {
        System.out.print("Nhap ma: ");
        String ma = sc.nextLine();
        if(tonTai(ma) != -1) {
            list.remove(list.get(tonTai(ma)));
            System.out.println("Xoa thanh cong");
        }else {
            System.err.println("Ma ko ton tai");
        }
    }

    @Override
    public void sua() {
        System.out.print("Nhap ma: ");
        String ma = sc.nextLine();
        if(tonTai(ma) != -1) {
            TaiLieu t = list.get(tonTai(ma));
            if(t instanceof Sach) {
                Sach sach = newSach();
                list.set(tonTai(ma), sach);
                
            }else if(t instanceof TapChi){
                TapChi tc = newTapChi();
                list.set(tonTai(ma), tc);
                
            }else if(t instanceof Bao){
                Bao bao = newBao();
                list.set(tonTai(ma), bao);
            }
            System.out.println("Sua thanh cong");
        }else {
            System.out.println("Ma khong ton tai!!!!");
        }
    }

    @Override
    public void tim1SoTruong() {
    }

    @Override
    public void sapXepTheoTenNXB() {
        Collections.sort(list);
        System.out.println("Sap xep thanh cong");
    }

    @Override
    public void sapXepTheoSoBanPhatHanh() {
        System.out.println("Sap xep thanh cong");
    }

    @Override
    public void sapXepTheoTenTacGia() {
        List<Sach> l = new ArrayList<>();
        for (TaiLieu x : list) {
            if(x instanceof Sach)
                l.add((Sach)x);
        }
        l.sort(new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o1.getTenTG().compareToIgnoreCase(o2.getTenTG());
            }
        });
        System.out.println("Sap xep thanh cong");
        for (Sach sach : l) {
            System.out.println(sach);
        }
    }

    @Override
    public void sapXepTheoTenSach() {
        List<Sach> l = new ArrayList<>();
        for (TaiLieu x : list) {
            if(x instanceof Sach)
                l.add((Sach)x);
        }
        l.sort(new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o1.getTenSach().compareToIgnoreCase(o2.getTenSach());
            }
        });
        System.out.println("Sap xep thanh cong");
        for (Sach sach : l) {
            System.out.println(sach);
        }
    }

    @Override
    public void sapXepTheoSoTrang() {
        List<Sach> l = new ArrayList<>();
        for (TaiLieu x : list) {
            if(x instanceof Sach)
                l.add((Sach)x);
        }
        l.sort(new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o1.getSoTrang() - o2.getSoTrang();
            }
        });
        System.out.println("Sap xep thanh cong");
        for (Sach sach : l) {
            System.out.println(sach);
        }
    }

    @Override
    public void sapXepTheoNgayPhatHanh() {
        List<Bao> b = new ArrayList<>();
        for (TaiLieu x : list) {
            if(x instanceof Bao)
                b.add((Bao)x);
        }
        b.sort(new Comparator<Bao>() {
            @Override
            public int compare(Bao o1, Bao o2) {
                return o1.getNgayPhatHanh() - o2.getNgayPhatHanh();
            }
        });
        System.out.println("Sap xep thanh cong");
        for (Bao bao : b) {
            System.out.println(bao);
        }
    }

    @Override
    public void tongSoPhatHanh() {
        int res = 0;
        for (TaiLieu x : list) {
            res += x.getSoBan();
        }
        System.out.println("Tong so phat hanh: " + res);
    }

    @Override
    public void tongSoPhatHanhTheoTungLoai() {
        int res1 = 0, res2 = 0, res3 = 0;
        for (TaiLieu x : list) {
            if(x instanceof Sach){
                res1 += x.getSoBan();
            }else if(x instanceof TapChi) {
                res2 += x.getSoBan();
            }else if(x instanceof Bao){
                res3 += x.getSoBan();
            }
        }
        System.out.println("Sach phat hanh: " + res1 + " ban");
        System.out.println("Tap chi phat hanh: " + res2 + " ban");
        System.out.println("Bao phat hanh: " + res3 + " ban");
    }

    @Override
    public void tongSoTheoTieuChiDieuKien() {
        
    }
}
