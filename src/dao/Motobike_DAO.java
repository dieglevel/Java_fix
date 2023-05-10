package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import connectDB.ConnectDB;
import entity.Motobike;

public class Motobike_DAO {
	
	public ArrayList<Motobike> getAllMotobike() throws SQLException{
		ArrayList<Motobike> temp = new ArrayList<>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "SELECT * FROM XeMay";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				temp.add(new Motobike(rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getDouble(4), 
						rs.getString(5), 
						rs.getString(6), 
						rs.getString(7), 
						rs.getDouble(8),
						rs.getString(9)));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		ConnectDB.disconnect();
		return temp;
	}
	
	public void addMoto(Motobike tmp) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		try {
			String sql = "insert into XeMay( MaXe,NuocSanXuat,LoaiXe,SoPK,SoKhung,SoSuon,MauXe,GiaXe,ThoiGianBaoHanh) \r\n"
					+ "values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, tmp.getMotobikeID());
			ps.setString(2, tmp.getCountryOfmanufacture());
			ps.setString(3, tmp.getRangeOfVehicle());
			ps.setDouble(4, tmp.getCubic());
			ps.setString(5,  tmp.getTheFrameOfTheMachine());
			ps.setString(6,  tmp.getNumberOfRibs());
			ps.setString(7,  tmp.getColor());
			ps.setDouble(8,  tmp.getMoney());
			ps.setString(9, tmp.getWarrantyPeriod());
			if(ps.executeUpdate()==1) {
				JOptionPane.showMessageDialog(null,"THÊM THÀNH CÔNG");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"THÊM THẤT BẠI");
			e.printStackTrace();
		}
	}
	
	public void deleteMoto(int id) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		try {
			String sql = "delete from PhieuNhanXetBaoHanh\r\n"
					+ "where MaXe = ?\r\n"
					+ "\r\n"
					+ "delete from ChiTietHopDong\r\n"
					+ "where MaXe = ?\r\n"
					+ "\r\n"
					+ "delete from XeMay\r\n"
					+ "where MaXe = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setInt(2, id);
			ps.setInt(3, id);
			if(ps.executeUpdate()==1) {
				JOptionPane.showMessageDialog(null, "XÓA THÀNH CÔNG");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "XÓA THẤT BẠI");
			e.printStackTrace();
		}
	}
}
