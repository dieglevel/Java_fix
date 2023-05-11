package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import connectDB.ConnectDB;
import entity.Customer;
import entity.Warranty;

public class Warranty_DAO {
	public ArrayList<Warranty> getAllWarranty() throws SQLException{
		ArrayList<Warranty> temp = new ArrayList<>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "Select MaPhieu, MaHopDong, MaXe, MaNhanVien, NgayBaoHanh, TenLinhKien, Loi, GiaTien from PhieuNhanXetBaoHanh";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				temp.add(new Warranty(rs.getString("MaPhieu"), 
									rs.getString("MaHopDong"), 
									rs.getString("MaXe"), 
									rs.getString("MaNhanVien"), 
									LocalDate.parse(rs.getString("NgayBaoHanh").trim(), DateTimeFormatter.ofPattern("d-M-yyyy")), 
									rs.getString("TenLinhKien"), 
									rs.getString("Loi"), 
									rs.getDouble("GiaTien")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
	
	public int getID() throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		int ID = 0;
		try {
			String sql = "SELECT TOP 1 MaPhieu FROM PhieuNhanXetBaoHanh order by MaPhieu desc";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				ID = rs.getInt("MaPhieu");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ID;
	}
	
	public void addWarranty(Warranty w) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("insert into PhieuNhanXetBaoHanh(MaPhieu, MaHopDong, MaNhanVien, MaXe, NgayBaoHanh, TenLinhKien, Loi, GiaTien) values (?,?,?,?,?,?,?,?)");
			stmt.setString(1, w.getMaBaoHanh());
			stmt.setString(2, w.getMaHopDong());
			stmt.setString(3, w.getMaNhanVien());
			stmt.setString(4, w.getMaXe());
			stmt.setString(5, w.getNgayBaoHanh().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))); 
			stmt.setString(6, w.getTenLinhKien());
			stmt.setString(7, w.getLoiBaoHanh());
			stmt.setDouble(8, w.getSoTien());
			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			stmt.close();
		}
	}
	
	public void updateWarranty(int iD, String newPart, String newError, String newPrice) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "update PhieuNhanXetBaoHanh \r\n"
					+ "set TenLinhKien = ?, Loi = ?, GiaTien = ?\r\n"
					+ "where MaPhieu = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newPart);
			ps.setString(2, newError);
			ps.setString(3, newPrice);
			ps.setInt(4, iD);
			if(ps.executeUpdate()>0)
				JOptionPane.showMessageDialog(null, "CẬP NHẬT THÀNH CÔNG");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "CẬP NHẬT THẤT BẠI");
			e.printStackTrace();
		}
	}
    
	public ArrayList<Warranty> searchWarranty(String dataSearch) throws SQLException {
		ArrayList<Warranty> temp = new ArrayList<>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "select *from PhieuNhanXetBaoHanh\r\n"
					+ "where MaPhieu like ? or\r\n"
					+ "MaHopDong like ? or\r\n"
					+ "MaNhanVien like ? or\r\n"
					+ "MaXe like ? or\r\n"
					+ "NgayBaoHanh like ? or\r\n"
					+ "TenLinhKien like ? or\r\n"
					+ "Loi like ? or\r\n"
					+ "GiaTien like ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"%"+ dataSearch + "%");
			ps.setString(2,"%"+ dataSearch + "%");
			ps.setString(3,"%"+ dataSearch + "%");
			ps.setString(4,"%"+ dataSearch + "%");
			ps.setString(5,"%"+ dataSearch + "%");
			ps.setString(6,"%"+ dataSearch + "%");
			ps.setString(7,"%"+ dataSearch + "%");
			ps.setString(8,"%"+ dataSearch + "%");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				temp.add(new Warranty(rs.getString("MaPhieu"), rs.getString("MaHopDong"), rs.getString("MaNhanVien"), rs.getString("MaXe"), 
						LocalDate.parse(rs.getString("NgayBaoHanh").trim(), DateTimeFormatter.ofPattern("dd-MM-yyyy")), 
						rs.getString("TenLinhKien"), rs.getString("Loi"), Integer.parseInt(rs.getString("GiaTien").trim())));
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Không tìm thấy");
			e.printStackTrace();
		}
		return temp;
	}
}
     