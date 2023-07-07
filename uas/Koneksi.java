/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class Koneksi {
    private static Connection MySQLConfig;
   
    
    public static Connection configDB() throws SQLException{
       try{
     String url = "jdbc:mysql://localhost:3306/db_perusahaan";
     String user = "root";
     String password = "";
     
     DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
     MySQLConfig = DriverManager.getConnection(url,user,password);
       }catch (SQLException e){
            System.out.println("Keneksi Gagal"+ e.getMessage());
       }
       
       return MySQLConfig;
    }
}
