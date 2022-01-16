/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneBook p = new PhoneBook();
        
        while (true) {            
            System.out.println("-------------MENU-------------");
            System.out.println("1. Nhap sdt noi hat");
            System.out.println("2. Nhap sdt quoc te");
            System.out.println("3. in");
            System.out.println("4. sua");
            System.out.println("5. Sap xep theo ma vung");
            System.out.println("6. Dua ra sdt co 3 so cuoi trung nhau");
            System.out.println("7. Dua ra sdt theo ma vung");
            System.out.println("------------------------------");
            
            int choose = Integer.parseInt(sc.nextLine());
            switch(choose) {
                case 0:
                    System.out.println("BYE!!!");
                    System.exit(0);
                case 1:
                    p.nhapSDTNoiHat();
                    break;
                case 2:
                    p.nhapSDTQuocTe();
                    break;
                case 3:
                    p.in();
                    break;
                case 4:
                    p.sua();
                    break;
                case 5:
                    p.sapXepTheoMaVung();
                    break;
                case 6:
                    p.duaRaSDT3SoCuoiTrungNhau();
                    break;
                case 7:
                    p.duaRaSDTTheoMaVung();
                    break;
                default:
                    System.out.println("Ban nhap tu 0 -> 7");
                    break;
            }
        }
    }

}
