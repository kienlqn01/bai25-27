/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai27;

/**
 *
 * @author Admin
 */
//class DatabaseManager {
    public class DatabaseManager extends ConfigObserver {
    @Override
    public void updateConfig(String key, String value) {
        if (key.equals("databaseUrl")) {
            System.out.println("DatabaseManager: Đã cập nhật URL cơ sở dữ liệu: " + value);
        }
    }
}

