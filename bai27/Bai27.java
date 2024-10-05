/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai27;

/**
 *
 * @author Admin
 */
public class Bai27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //    public class Main {
   // public static void main(String[] args) {
        // Lấy thể hiện duy nhất của SystemConfig
        SystemConfig config = SystemConfig.getInstance();

        // Tạo các observer
        DatabaseManager dbManager = new DatabaseManager();
        ConnectionPoolManager poolManager = new ConnectionPoolManager();

        // Đăng ký các observer
        config.registerObserver(dbManager);
        config.registerObserver(poolManager);

        // Thay đổi các giá trị cấu hình và quan sát thông báo
        System.out.println("Thay đổi cấu hình lần 1:");
        config.setDatabaseUrl("jdbc:mysql://localhost:3306/mydb");
        config.setMaxConnections(50);
        config.setTimeoutSeconds(30);

        // Hủy đăng ký observer DatabaseManager
        config.unregisterObserver(dbManager);

        // Thay đổi cấu hình và kiểm tra thông báo sau khi hủy đăng ký
        System.out.println("\nThay đổi cấu hình lần 2 (sau khi hủy đăng ký DatabaseManager):");
        config.setDatabaseUrl("jdbc:mysql://localhost:3306/otherdb");
        config.setMaxConnections(100);

        // Kiểm tra xem hai lần gọi getInstance() có trả về cùng một đối tượng hay không
        SystemConfig config2 = SystemConfig.getInstance();
        System.out.println("\nHai lần gọi getInstance() có trả về cùng đối tượng không? " + (config == config2));
    }
}

    }
    
}
