/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class Database{
    private static final String URL ="jdbc:mysql://localhost/zeez";
    private static final String USER ="root";
    private static final String PASS ="";
    public static Connection con;
    public static Statement st;
    
    public static void connect(){    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection(URL,USER,PASS);
            st = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
    
public static ResultSet executeQuery(String query, Object... params) {
    ResultSet resultSet = null;
    try {
        PreparedStatement ps = con.prepareStatement(query);
        // Set parameters secara dinamis
        for (int i = 0; i < params.length; i++) {
            ps.setObject(i + 1, params[i]);
        }
        resultSet = ps.executeQuery();
    } catch (SQLException e) {
        System.err.println("Query gagal: " + e.getMessage());
    }
    return resultSet;
}

    
}
