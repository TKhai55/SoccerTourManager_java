/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoccerManagementModel;

import java.sql.*;
/**
 *
 * @author Administrator
 */
public class ConnectDB {
    Connection conn;
    public ConnectDB() {};
    public Connection createConn(){
        try{
        //Đăng ký Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Connection URL
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/soccermanager?useSSL=false","root","Amon5555@");

        if (conn == null)
                        System.out.println("Kết nối không thành công");
                    else
                        System.out.println("Kết nối thành công");
                } catch(Exception e){
                    e.printStackTrace();
                }
                return conn;
    }

}