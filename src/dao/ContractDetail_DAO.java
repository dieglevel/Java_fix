/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import entity.Contract;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ContractDetail_DAO {
    public int getLastID() throws SQLException{
            
            ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "SELECT TOP 1 MaChiTiet FROM ChiTietHopDong ORDER BY MaChiTiet DESC";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
                        rs.next();
                        return rs.getInt(1)+1;
                                
		}catch(Exception e) {
                        return 1;
		}
                finally{
                    	ConnectDB.disconnect();
                        
                }

                
        }
    
    public ArrayList<entity.ContractDetail> getAllContractDetail() throws SQLException{
		ArrayList<entity.ContractDetail> list = new ArrayList<entity.ContractDetail>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "SELECT * FROM ChiTietHopDong";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				list.add(new entity.ContractDetail(
                                        rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5))
					);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		ConnectDB.disconnect();
		return list;
	}
    
    public void addContract(entity.ContractDetail contractDetail) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "INSERT INTO [dbo].[ChiTietHopDong]\r\n"
					+ "           ([MaChiTiet]\r\n"
					+ "           ,[MaHopDong]\r\n"
					+ "           ,[MaXe]\r\n"
					+ "           ,[SoLuong]\r\n"
					+ "           ,[TongTien])\r\n"
					+ "     VALUES\r\n"
					+ "           (?, ?, ?, ?, ?)";
                        
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, contractDetail.getMaChiTiet());
                        ps.setInt(2, contractDetail.getMaHopDong());
                        ps.setInt(3, contractDetail.getMaXe());
                        ps.setInt(4, contractDetail.getSoLuong());
                        ps.setDouble(5, contractDetail.getTongTien());
			if(ps.executeUpdate() == 1) {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			ConnectDB.disconnect();
		}
		
	}
}
