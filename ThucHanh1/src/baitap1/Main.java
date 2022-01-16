/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = null;
        Xau s = new Xau();
        MaTran mt = null;
        while (true) {            
            System.out.println("-------MENU------");
            System.out.println("1. Nhap vao 2 phan so tu va mau");
            System.out.println("2. Tinh hieu 2 phan so");
            System.out.println("3. Tinh tich 2 phan so");
            
            System.out.println("4. Nhap vao 1 xau");
            System.out.println("5. Kiem tra ma phieu");
            System.out.println("6. Viet ra cac so trong xau");
            
            
            System.out.println("7. Nhap vao 1 ma tran vuong A");
            System.out.println("8. Dua ra cac so nguyen to cua ma tran A");
            System.out.println("9. Dua ra cac so theo thu tu tang dan va so lan xuat hien");
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            int choose = sc.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("BYE!!!");
                    System.exit(choose);
                case 1:
                    a = new PhanSo();
                    a.nhap();
                    break;
                case 2:
                    PhanSo b = new PhanSo();
                    b.nhap();
                    PhanSo c = a.tinhHieu(b);
                    a.viet();
                    b.viet();
                    c.viet();
                    break;
                case 3:
                    PhanSo m = new PhanSo();
                    m.nhap();
                    PhanSo n = a.nhan(m);
                    a.viet();
                    m.viet();
                    n.viet();
                    break;
                case 4:
                    s.nhap();
                    break;
                case 5:
                    s.nhap();
                    s.kiemmTra();
                    break;
                case 6:
                    s.nhap();
                    s.tachSo();
                    break;
                case 7:
                    mt = new MaTran();
                    mt.nhap();
                    break;
                case 8:
                    mt.viet();
                    mt.inRaNguyenTo();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Ban nhap tu 0 -> 9");
                    break;
            }
        }
    }
}
