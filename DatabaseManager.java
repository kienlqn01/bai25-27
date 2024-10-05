/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
//public class DatabaseManager {
    // Observer: DatabaseManager
public class DatabaseManager implements ConfigObserver {
    public void updateConfig(String key, String value) {
        if (key.equals("databaseUrl")) {
            System.out.println("DatabaseManager: Đã cập nhật URL cơ sở dữ liệu: " + value);
        }
    }
}


