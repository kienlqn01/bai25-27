/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai25;

/**
 *
 * @author Admin
 */
public  class Singleton implements I {
    // Biến tĩnh giữ thể hiện duy nhất của lớp
    private static Singleton instance;

    // Constructor riêng tư để ngăn việc tạo đối tượng từ bên ngoài
    private Singleton() {
        // Mã khởi tạo ở đây
    }

    // Phương thức tĩnh để cung cấp thể hiện duy nhất của lớp
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Triển khai các phương thức từ interface (tùy chọn)
    public void hienThiThongDiep() {
        System.out.println("Xin chào từ Singleton!");
    }
}
