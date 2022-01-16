/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        QLGV q = new QLGV();
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.println("------------------MENU------------------");
            System.out.println("1. Nhap giang vien co huu");
            System.out.println("2. Nhap giang vien thinh giang");
            System.out.println("3. In danh sach giang vien");
            System.out.println("4. Xoa giang vien");
            System.out.println("5. Sua giang vien");
            System.out.println("6. In danh sach giang vien co huu");
            System.out.println("7. In danh sach giang vien thinh giang");
            System.out.println("8. Tim kiem giang vien gan dung");
            System.out.println("9. Sap xeo giang vien theo ten");
            System.out.println("10. Sap xep giang vien theo he so luong");
            System.out.println("11. Sap xep giang vien theo luong linh");
            System.out.println("12. Tinh tong luong tat ca giang vien");
            System.out.println("13. Tinh luong trung binh");
            System.out.println("14. Tim giang vien co luong cao nhat");
            System.out.println("0. Thoat");
            System.out.println("----------------------------------------");
            
            int choose = Integer.parseInt(sc.nextLine());
            switch(choose) {
                case 0:
                    System.out.println("BYE!!!");
                    System.exit(0);
                case 1:
                    q.nhapGiangVienCoHuu();
                    break;
                case 2:
                    q.nhapGiangVienThinhGiang();
                    break;
                case 3:
                    q.inDSGV();
                    break;
                case 4:
                    q.xoaGV();
                    break;
                case 5:
                    q.suaGV();
                    break;
                case 6:
                    q.inDSGVCH();
                    break;
                case 7:
                    q.inDSGVTG();
                    break;
                case 8:
                    q.timKiemGVGanDung();
                    break;
                case 9:
                    q.sapXepDSTheoHoTen();
                    break;
                case 10:
                    q.sapXepTheoHeSoLuong();
                    break;
                case 11:
                    q.sapXepTheoLuongLinh();
                    break;
                case 12:
                    q.tinhTongLuong();
                    break;
                case 13:
                    q.tinhTrungBinhLuong();
                    break;
                case 14:
                    q.timGVCoLuongCaoNhat();
                    break;
                default:
                    System.out.println("Ban nhap tu 0 -> 14");
                    break;
            }
        }
    }
}
