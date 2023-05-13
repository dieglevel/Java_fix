/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static connectDB.ConnectDB.con;
import entity.History;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class History_DAO {
    private static History_DAO instance = new History_DAO();
    
    public static History_DAO getInstance(){
        return instance;
    }
    
    public int getLastID() throws SQLException{
        connectDB.ConnectDB.getInstance().connect();
        Connection con = connectDB.ConnectDB.getConnection();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT TOP 1 MaLichSu FROM LichSu ORDER BY MaLichSu DESC");
        while (rs.next()){
            return rs.getInt(1)+1;
        }
        return 1;
    }
    
    
    public void historyInsert (int maNhanVien, String data) {
        try {
            connectDB.ConnectDB.getInstance().connect();
            Connection con = connectDB.ConnectDB.getConnection();
            Date date = new Date();
            Object param = new java.sql.Timestamp(date.getTime());
            PreparedStatement stm = con.prepareStatement("INSERT INTO [dbo].[LichSu]\n" +
                    "           ([MaLichSu]\n" +
                    "           ,[MaNhanVien]\n" +
                    "           ,[CauLenh]\n" +
                    "           ,[ThoiGian])\n" +
                    "     VALUES\n" +
                    "           (?, ?, ? ,?)");
            stm.setInt(1,getLastID());
            stm.setInt(2, maNhanVien);
            stm.setString(3, data);
            stm.setObject(4, param);
            
            if (stm.executeUpdate() == 1){
                
            }
            else{
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(History_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ArrayList<History> getAllHistory() {
        try {
            ArrayList<History> temp =  new ArrayList<>();
            connectDB.ConnectDB.getInstance().connect();
            Connection con = connectDB.ConnectDB.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM LichSu");
            while (rs.next()){
                temp.add(new History (rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4)
                ));
            }
            return temp;
        } catch (SQLException ex) {
            Logger.getLogger(History_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
