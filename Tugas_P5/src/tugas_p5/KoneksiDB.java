/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_p5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {
    private static Connection mysqlconfig;

    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/db_perumahan"; // ganti dengan database kamu
            String user = "root"; // user DB
            String pass = "";     // password DB
            Class.forName("com.mysql.cj.jdbc.Driver");
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Koneksi Gagal " + e.getMessage());
        }
        return mysqlconfig;
    }
}
