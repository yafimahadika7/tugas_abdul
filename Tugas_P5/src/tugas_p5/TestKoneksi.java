/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_p5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestKoneksi {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db_perumahan?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "root"; // Ganti dengan username MySQL Anda
        String pass = ""; // Ganti dengan password MySQL Anda

        try {
            // Coba koneksi ke database
            Connection conn = DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Koneksi berhasil!");
            }
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }
}
