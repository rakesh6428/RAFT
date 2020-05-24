package edu.sjsu.cs249.raft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static String url = "jdbc:mysql://localhost:3306/Raft";
	private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "root";   
    private static String password = "Rak1Dan2";
    private static Connection con;
    private static String urlstring;

    public static Connection getConnection() {
        try {
            //Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (Exception ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return con;
    }
}
