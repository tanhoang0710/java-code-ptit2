/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Data {
    private List<Phong> l1 = new ArrayList<>();
    private List<KhachHang> l2 = new ArrayList<>();

    public Data() {
    }
    
    public void addPhong(Phong x) {
        l1.add(x);
    }
    
    public void addKH(KhachHang x) {
        l2.add(x);
    }
    
    public void show() {
        Collections.sort(l2);
        double tienPhucVu = 0, tongTien = 0;
        long soNgayO = 0;
        long tienChuaGiam = 0;
        double tienPhaiTra = 0;
        for (KhachHang x : l2) {
            for (Phong y : l1) {
                if(x.getMaPhong().equalsIgnoreCase(y.getKiHieu())){
                    soNgayO = x.getSoNgayO();
                    tienChuaGiam = soNgayO * y.getDonGiaNgay();
                    tienPhucVu = soNgayO * y.getDonGiaNgay() * y.getPhiPhucVu();
                    tongTien = tienChuaGiam + tienPhucVu;
                    tienPhaiTra = tongTien - tongTien * x.getPhanTramGiam();
                }
            }
            if(x.getNgayDen().equals(x.getNgayDi())) soNgayO = 0;
            System.out.printf(x.getMaKH() + " " + x.getHoTen() + " " + x.getTenPhong()+ " " + soNgayO + " %.2f\n", tienPhaiTra);
        }
    }
}
