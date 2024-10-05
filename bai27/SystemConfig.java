/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai27;
 import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */

   

// Singleton Class: SystemConfig
public class SystemConfig {
    private static SystemConfig instance;

    static SystemConfig getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static SystemConfig getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String databaseUrl;
    private int maxConnections;
    private int timeoutSeconds;
    private final List<ConfigObserver> observers = new ArrayList<>();

    // Constructor private để ngăn tạo thể hiện khác (Singleton)
    private SystemConfig() {}

    // Phương thức tĩnh để lấy thể hiện duy nhất (Singleton)
    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    // Các phương thức getter và setter
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
        notifyObservers("databaseUrl", databaseUrl);
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
        notifyObservers("maxConnections", Integer.toString(maxConnections));
    }

    public int getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(int timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        notifyObservers("timeoutSeconds", Integer.toString(timeoutSeconds));
    }

//    // Đăng ký observer
//    public void registerObserver(ConfigObserver observer) {
//        observers.add(observer);
//    }
//
//    // Hủy đăng ký observer
//    public void unregisterObserver(ConfigObserver observer) {
//        observers.remove(observer);
//    }

    // Thông báo cho tất cả observer khi có thay đổi
    private void notifyObservers(String key, String value) {
        for (ConfigObserver observer : observers) {
            observer.updateConfig(key, value);
        }
    }

    void registerObserver(DatabaseManager dbManager) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


