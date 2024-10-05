/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai26;

/**
 *
 * @author Admin
 */

    class NhaDauTuA implements NhaDauTu {
    private final String ten;

    public NhaDauTuA(String ten) {
        this.ten = ten;
    }

    @Override
    public void capNhatThongTin(String thongTin) {
        System.out.println("Nhà đầu tư " + ten + " nhận được thông báo: " + thongTin);
    }
}

