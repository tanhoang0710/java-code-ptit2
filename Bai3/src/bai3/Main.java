/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        QLTL q = new QLTL();
        
        while(true) {
            System.out.println("-------------MENU-------------");
            System.out.println("1. Nhap sach");
            System.out.println("2. Nhap tap chi");
            System.out.println("3. Nhap bao");
            
            System.out.println("4. In ra sanh sach");
            
            System.out.println("5. Tim kiem theo ma");
            System.out.println("6. Tim kiem theo ten NXB");
            System.out.println("7. Tim kiem theo ten tac gia");
            System.out.println("8. Tim kiem theo ten sach");
            System.out.println("9. Tim kiem theo ngay phat hanh");
            System.out.println("10. Tim kiem theo tu thang den thang");
            System.out.println("11. Tim kiem theo tu ngay den ngay");
            System.out.println("12. Tim kiem theo tu trang den trang");
            System.out.println("13. Tim kiem theo so ban phat hanh");
            
            System.out.println("14. Xoa");
            System.out.println("15. Sua");
            
            System.out.println("16. Tim 1 so truong");
            
            System.out.println("17. Sap xep theo ten NXB");
            System.out.println("18. Sap xep theo so ban phat hanh");
            System.out.println("19. Sap xep theo ten tac gia");
            System.out.println("20. Sap xep theo ten sach");
            System.out.println("21. Sap xep theo so trang");
            System.out.println("22. Sap xep theo ngay phat hanh");
            
            System.out.println("23. Tong so phat hanh");
            System.out.println("24. Tong so phat hanh theo tung loai");
            System.out.println("25. Tong so thoe tieu chi dieu kien");
            
            System.out.println("0. Thoat");
            System.out.println("--------------------------------");
            System.out.println("BAN CHON TU 0 -> 25");
            
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch(chon) {
                case 0:
                    System.out.println("BYE!!!");
                    System.exit(0);
                case 1:
                    q.nhapSach();
                    break;
                case 2:
                    q.nhapTapChi();
                    break;
                case 3: 
                    q.nhapBao();
                    break;
                case 4:
                    q.in();
                    break;
                case 5:
                    q.timKiemTheoMa();
                    break;
                case 6:
                    q.timKiemTheoTenNXB();
                    break;
                case 7:
                    q.timKiemTheoTenTacGia();
                    break;
                case 8:
                    q.timKiemTheoTenSach();
                    break;
                case 9:
                    q.timKiemTheoNgayPhatHanh();
                    break;
                case 10:
                    q.timKiemTheoTuThangDenThang();
                    break;
                case 11:
                    q.timKiemTheoTuNgayDenNgay();
                    break;
                case 12:
                    q.timKiemTheoTuTrangDenTrang();
                    break;
                case 13:
                    q.timKiemTheoSoBanPhatHanh();
                    break;
                case 14:
                    q.xoa();
                    break;
                case 15:
                    q.sua();
                    break;
                case 16:
                    q.tim1SoTruong();
                    break;
                case 17:
                    q.sapXepTheoTenNXB();
                    break;
                case 18:
                    q.sapXepTheoSoBanPhatHanh();
                    break;
                case 19:
                    q.sapXepTheoTenTacGia();
                    break;
                case 20:
                    q.sapXepTheoTenSach();
                    break;
                case 21:
                    q.sapXepTheoSoTrang();
                    break;
                case 22:
                    q.sapXepTheoNgayPhatHanh();
                    break;
                case 23:
                    q.tongSoPhatHanh();
                    break;
                case 24:
                    q.tongSoPhatHanhTheoTungLoai();
                    break;
                case 25:
                    q.tongSoTheoTieuChiDieuKien();
                    break;
                default:
                    System.out.println("Chon tu 0 -> 25");
                    break;
            }
        }
    }
}
