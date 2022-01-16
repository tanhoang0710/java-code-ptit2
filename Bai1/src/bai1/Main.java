/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        PhoneBook p = new PhoneBook();
        while(true) {
            System.out.println("-------------MENU-------------");
            System.out.println("1. Them SDT moi");
            System.out.println("2. Tim SDT theo ma vung");
            System.out.println("3. Liet ke SDT");
            
            System.out.println("4. Tong sdt theo tung vung");
            System.out.println("5. Tim kiem theo co duoi la");
            System.out.println("6. Sap xep");
            
            System.out.println("0. Thoat");
            System.out.println("--------------------------------");
            
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch(chon) {
                case 0:
                    System.out.println("BYE!!!");
                    System.exit(0);
                case 1:
                    p.themSDT();
                    break;
                case 2:
                    p.timSDTTheoVung();
                    break;
                case 3:
                    p.lietKeCacSDT();
                    break;
                case 4:
                    p.tongSDTTheoTungVung();
                    break;
                case 5:
                    p.timKiemTheoDuoi();
                    break;
                case 6:
                    p.sapXepSDT();
                    break;
                default:
                    System.out.println("Chon tu 0 -> 6");
                    break;
            }
        }
    }
}
