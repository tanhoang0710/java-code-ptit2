/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        QLGD q = new QLGD();
        Scanner sc = new Scanner(System.in);
        
        while (true) {            
            System.out.println("----------------MENU----------------");
            System.out.println("1. Them giao dich tien");
            System.out.println("2. Them giao dich vang");
            System.out.println("3. Them giao dich dat");
            System.out.println("4. In ds");
            System.out.println("5. Sua");
            System.out.println("6. Xoa");
            System.out.println("7. Tong so GD moi loai");
            System.out.println("8. Danh sach GD theo ngay");
            System.out.println("9. DS GD chua ngay");
            System.out.println("10. DS GD tu nam den nam");
            System.out.println("------------------------------------");
            
            int choose;
            choose = Integer.parseInt(sc.nextLine());
            switch(choose) {
                case 0:
                    System.out.println("BYE !!!");
                    System.exit(0);
                case 1:
                    q.themGiaoDichTien();
                    break;
                case 2:
                    q.themGiaoDichVang();
                    break;
                case 3:
                    q.themGiaoDichDat();
                    break;
                case 4:
                    q.inDS();
                    break;
                case 5:
                    q.sua();
                    break;
                case 6:
                    q.xoa();
                    break;
                case 7:
                    q.tongSoGiaoDichCuaMoiLoai();
                    break;
                case 8:
                    q.hienThiDSGiaoDichTheoNgay();
                    break;
                case 9:
                    q.hienThiDSGiaoDichCoChuaNgay();
                    break;
                case 10:
                    q.hienThiDSGiaoDichTuNamDenNam();
                    break;
                default:
                    System.out.println("Ban nhap tu 0 -> 10");
                    break;
            }
        }
    }
}
