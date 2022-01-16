/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author DELL
 */
public interface ChucNang {
//    1. Nhập thông tin về các tài liệu (có kiểm tra nhập liệu cho 1 số trường, ví dụ mã tài liệu,
//    ngày phát hành,….). In ra thông tin về các tài liệu. (in vào 1 bảng hoặc in mỗi loại tài
//    liệu vào 1 bảng), có tính tổng số tài liệu ở cuối bảng. Tìm kiếm tài liệu (tìm gần đúng)
//    theo riêng từng tiêu chí: mã tài liệu, tên nhà xuất bản, tên tác giả, tên sách, ngày phát
//    hành,… Tìm kiếm tài liệu theo khoảng xác định của từng tiêu chí: Từ tháng… đến
//    tháng (tháng phát hành), từ ngày… đến ngày (ngày phát hành), số trang từ… đến (số
//    trang sách), số bản phát hành từ…. đến (số bản phát hành)
//    2. Xóa, sửa tài liệu (nhập vào mã tài liệu)
//    3. Tìm 1 số trường (tìm gần đúng)
//    4. sắp xếp theo: tên nhà xuất bản, số bản phát hành, tên tác giả, tên sách, số trang, ngày
//    phát hành…..
//    5. Thống kê: tổng số phát hành, tổng số phát hành cho từng loại, tổng số theo tiêu chí điều
//    kiện (theo năm, tháng, số sách của tác giả nào đó, số sách dày,….)
    public void nhapSach();
    public void nhapTapChi();
    public void nhapBao();
    
    public void in();
    
    public void timKiemTheoMa();
    public void timKiemTheoTenNXB();
    public void timKiemTheoTenTacGia();
    public void timKiemTheoTenSach();
    public void timKiemTheoNgayPhatHanh();
    public void timKiemTheoTuThangDenThang();
    public void timKiemTheoTuNgayDenNgay();
    public void timKiemTheoTuTrangDenTrang();
    public void timKiemTheoSoBanPhatHanh();
            
    public void xoa();
    public void sua();
    
    public void tim1SoTruong();
    
    public void sapXepTheoTenNXB();
    public void sapXepTheoSoBanPhatHanh();
    public void sapXepTheoTenTacGia();
    public void sapXepTheoTenSach();
    public void sapXepTheoSoTrang();
    public void sapXepTheoNgayPhatHanh();
    
    public void tongSoPhatHanh();
    public void tongSoPhatHanhTheoTungLoai();
    public void tongSoTheoTieuChiDieuKien();

}
