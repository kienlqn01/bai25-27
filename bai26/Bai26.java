/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai26;

/**
 *
 * @author Admin
 */
public class Bai26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        public class Main {
  //  public static void main(String[] args) {
        // Lấy thể hiện duy nhất của DichVuChungKhoan
        DichVuChungKhoan dichVuChungKhoan = DichVuChungKhoan.getInstance();

        // Tạo các nhà đầu tư
        NhaDauTu nhaDauTu1 = new NhaDauTuA("A");
        NhaDauTu nhaDauTu2 = new NhaDauTuB("B");

        // Đăng ký nhà đầu tư
        dichVuChungKhoan.dangKyNhaDauTu(nhaDauTu1);
        dichVuChungKhoan.dangKyNhaDauTu(nhaDauTu2);

        // Cập nhật giá cổ phiếu
        dichVuChungKhoan.capNhatGiaCoPhieu("100.000 VND");

        // Hủy đăng ký một nhà đầu tư
        dichVuChungKhoan.huyDangKyNhaDauTu(nhaDauTu2);

        // Cập nhật giá cổ phiếu lần nữa
        dichVuChungKhoan.capNhatGiaCoPhieu("105.000 VND");
    }
}

    
    

