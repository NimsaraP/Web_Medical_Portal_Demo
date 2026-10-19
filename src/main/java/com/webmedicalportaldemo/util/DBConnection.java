package com.webmedicalportaldemo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    // Database connection configuration
    // Set environment variables DB_USERNAME and DB_PASSWORD for production use
    private static final String URL = "jdbc:mysql://localhost:3306/webmedicalportal";
    private static final String USER = System.getenv("DB_USERNAME") != null ? System.getenv("DB_USERNAME") : "root";
    private static final String PASSWORD = System.getenv("DB_PASSWORD") != null ? System.getenv("DB_PASSWORD") : "your_password_here";

    public static Connection getConnection() {
        try {
            // Loads Library
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("Connection Error: " + e.getMessage());
            return null;
        }
    }
}
