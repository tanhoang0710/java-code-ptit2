/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiithuchanh2;

/**
 *
 * @author DELL
 */
public interface ChucNang {
    public void nhapOto();
    public void nhapXeMay();
    public void vietDS();
    public void xoa();
    public void sua();
    public void timTheoMa();
    public void timTheoHang();
    public void timTheoNam(); // tu nam bn  den nam bn
    public void timTheoGiaCao(); //  >=
    public void timTheoSoCho(); // oto
    public void sapXepTheoMa();
    public void sapXepTheoSoCho();
    public void sapXepTheoNam();
    public void sapXepOtoTheoSoCho();
    public void sapXepXemayTheoCongSuat();
    public void sapXepTheoGiaNam();
    public void sapXepTheoMauVaGia(); // 2 thuoc tinh
    public void thongKe(); // min, max, sum, ....
}
