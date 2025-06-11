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

// Kelas Database digunakan untuk mengelola koneksi dan interaksi dengan database MySQL
public class Database {
    // URL koneksi ke database MySQL lokal dengan nama database 'zeez'
    private static final String URL = "jdbc:mysql://localhost/zeez";
    // Username untuk koneksi ke database
    private static final String USER = "root";
    // Password untuk koneksi ke database (kosong dalam hal ini)
    private static final String PASS = "";
    
    // Objek koneksi dan statement bersifat statik agar dapat diakses langsung
    public static Connection con;
    public static Statement st;
    
    // Metode untuk menghubungkan aplikasi dengan database
    public static void connect() {
        try {
            // Memuat driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Membuka koneksi ke database
            con = DriverManager.getConnection(URL, USER, PASS);
            // Membuat statement umum untuk eksekusi SQL
            st = con.createStatement();
            System.out.println("Koneksi berhasil;");
        } catch (Exception e) {
            // Menangani kesalahan koneksi
            System.err.println("Koneksi gagal: " + e.getMessage());
        }
    }

    // Metode untuk mengeksekusi query SELECT dengan parameter dinamis
    public static ResultSet executeQuery(String query, Object... params) {
        ResultSet resultSet = null;
        try {
            // Mempersiapkan query SQL dengan parameter
            PreparedStatement ps = con.prepareStatement(query);
            // Mengatur nilai parameter secara dinamis
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            // Mengeksekusi query SELECT dan mengembalikan hasilnya
            resultSet = ps.executeQuery();
        } catch (SQLException e) {
            // Menangani kesalahan query
            System.err.println("Query gagal: " + e.getMessage());
        }
        return resultSet;
    }

    // Metode untuk mengeksekusi query INSERT, UPDATE, DELETE dengan parameter dinamis
    public static int executeUpdate(String query, Object... params) {
        int affectedRows = 0;
        try {
            // Mempersiapkan query SQL dengan parameter
            PreparedStatement ps = con.prepareStatement(query);
            // Mengatur nilai parameter secara dinamis
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            // Mengeksekusi query dan menghitung baris yang terpengaruh
            affectedRows = ps.executeUpdate();
        } catch (SQLException e) {
            // Menangani kesalahan eksekusi
            System.err.println("Update gagal: " + e.getMessage());
        }
        return affectedRows;
    }
}

