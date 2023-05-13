/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Login;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class Login_DAO {
    
    private static Login_DAO instance = new Login_DAO();
    
    public static Login_DAO getInstance(){
        return instance;
    }
    
    public ArrayList<entity.Login> getAllLogin() throws SQLException{
        ArrayList<entity.Login> temp = new ArrayList<>();
        connectDB.ConnectDB.getInstance().connect();
        Connection con  = connectDB.ConnectDB.getConnection();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM TaiKhoan");
        while(rs.next()){
            temp.add(new Login(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
        }
        connectDB.ConnectDB.disconnect();
        return temp;
    }
}
