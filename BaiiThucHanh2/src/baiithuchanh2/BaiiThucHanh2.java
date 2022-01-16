/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiithuchanh2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BaiiThucHanh2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QLPTGT q = new QLPTGT();
        
        while(true) {
            System.out.println("-------------MENU-------------");
            System.out.println("1. Nhap Oto");
            System.out.println("2. Nhap Xe may");
            System.out.println("3. Nhap Viet ds");
            
            System.out.println("4. Xoa");
            System.out.println("5. Sua");
            System.out.println("6. Sua Oto");
            
            System.out.println("7. Tim theo ma");
            System.out.println("8. Tim theo hang");
            
            System.out.println("9. Tim theo mau");
            System.out.println("10. Tim theo nam");
            System.out.println("11. Tim oto theo so cho");
            
            System.out.println("12. Sap xep theo ma");
            System.out.println("13. Sap xep theo nam");
            System.out.println("14. Sap xep theo gia");
            System.out.println("15. Sap xep theo nam va gia"); // 2 thuoc tinh
            System.out.println("16. Sap xep oto theo so cho");
            System.out.println("17. Sap xep xe may theo cong suat");
            System.out.println("18. Sap xep theomau giam gia tang");
            
            
            System.out.println("19. PT dat nhat");
            
            System.out.println("0. Thoat");
            System.out.println("--------------------------------");
            
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch(chon) {
                case 0:
                    System.out.println("BYE!!!!");
                    System.exit(0);
                case 1:
                    q.nhapOto();
                    break;
                case 2:
                    q.nhapXeMay();
                    break;
                case 3:
                    q.vietDS();
                    break;
                case 12:
                    q.sapXepTheoMa();
                    break;
                case 15: 
                    //q.sapXepTheoNamVaGia();
                    break;
                case 16:
                    q.sapXepOtoTheoSoCho();
                    break;
                case 17: 
                    q.sapXepXemayTheoCongSuat();
                    break;
                    
                case 18:
                    q.sapXepTheoMauVaGia();
                    break;
                case 19:
                    q.thongKe();
                    break;
                default:
                    System.out.println("Ban nhap tu 0 -> 15");
                    break;
            }
        }
    }
    
}
