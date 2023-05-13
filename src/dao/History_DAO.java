/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Date;
import java.time.LocalDate;
/**
 *
 * @author Admin
 */
public class History_DAO {
    
    public int getLastID() throws SQLException{
        connectDB.ConnectDB.getInstance().connect();
        Connection con = connectDB.ConnectDB.getConnection();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT TOP 1 MaLichSu FROM LichSu ORDER BY MaLichSu DESC");
        while (rs.next()){
            return rs.getInt(1);
        }
        return -1;
    }
    
    
    public void historyInsert (int maNhanVien, String data) throws SQLException{
        connectDB.ConnectDB.getInstance().connect();
        Connection con = connectDB.ConnectDB.getConnection();
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
        stm.setDate(4, Date.valueOf(LocalDate.now()));
        
        if (stm.executeUpdate() == 1){
            
        }
        else{
            System.out.println("???????????");
        }
    }
}
