/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai26;
  import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
class DichVuChungKhoan {
  

// Singleton Class: DichVuChungKhoan

    private static DichVuChungKhoan instance;

    static DichVuChungKhoan getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private final List<NhaDauTu> danhSachNhaDauTu = new ArrayList<>();
    private String giaCoPhieu;

    // Constructor riêng tư (Singleton)
    private DichVuChungKhoan() {}

    // Phương thức tĩnh để lấy thể hiện duy nhất của lớp (Singleton)
    public static DichVuChungKhoan getInstance() {
        if (instance == null) {
            instance = new DichVuChungKhoan();
        }
        return instance;
    }

    // Đăng ký nhà đầu tư
    public void dangKyNhaDauTu(NhaDauTu nhaDauTu) {
        danhSachNhaDauTu.add(nhaDauTu);
    }

    // Hủy đăng ký nhà đầu tư
    public void huyDangKyNhaDauTu(NhaDauTu nhaDauTu) {
        danhSachNhaDauTu.remove(nhaDauTu);
    }

    // Cập nhật giá cổ phiếu
    public void capNhatGiaCoPhieu(String giaCoPhieuMoi) {
        this.giaCoPhieu = giaCoPhieuMoi;
        thongBaoChoTatCaNhaDauTu();
    }

    // Thông báo cho tất cả các nhà đầu tư
    private void thongBaoChoTatCaNhaDauTu() {
        for (NhaDauTu nhaDauTu : danhSachNhaDauTu) {
            nhaDauTu.capNhatThongTin("Giá cổ phiếu mới: " + giaCoPhieu);
        }
    }
}

    

