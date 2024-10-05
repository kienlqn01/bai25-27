/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai27;

/**
 *
 * @author Admin
 */
//class ConnectionPoolManager {
    public class ConnectionPoolManager extends ConfigObserver {
    @Override
    public void updateConfig(String key, String value) {
        if (key.equals("maxConnections")) {
            System.out.println("ConnectionPoolManager: Đã cập nhật số lượng kết nối tối đa: " + value);
        } else if (key.equals("timeoutSeconds")) {
            System.out.println("ConnectionPoolManager: Đã cập nhật thời gian chờ: " + value + " giây");
        }
    }
}



