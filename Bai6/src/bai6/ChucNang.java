/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

/**
 *
 * @author DELL
 */
public interface ChucNang {
    //    1. Them Giao Dich Vang
//    2. Them Giao Dich Tien Te
//    3. Hien Thi Danh Sach Giao Dich
//    4. Sửa ….
//    5. Xóa…..
//    6. Xem Tong So Luong cua cac Giao Dich
//    7. Hien Thi Danh Sach Giao Dich theo ngay
//    8. Hien Thi DS Giao Dich co chua ngay
//    9. Hien Thi DS Giao Dich theo Tu nam den Nam
    
    public void themGiaoDichTien();
    public void themGiaoDichVang();
    public void themGiaoDichDat();
    public void inDS();
    public void sua();
    public void xoa();
    public void tongSoGiaoDichCuaMoiLoai();
    public void hienThiDSGiaoDichTheoNgay();
    public void hienThiDSGiaoDichCoChuaNgay();
    public void hienThiDSGiaoDichTuNamDenNam();
}
