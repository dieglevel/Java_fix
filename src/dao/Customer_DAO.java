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
import entity.Customer;

public class Customer_DAO {
	
	public ArrayList<Customer> getAllCustomer() throws SQLException{
		ArrayList<Customer> temp = new ArrayList<>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "SELECT * FROM KhachHang";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				temp.add(new Customer(rs.getString("MaKhachHang"), 
						rs.getString("TenKhachHang").trim(), 
						rs.getString("SoDienThoai").trim(), 
						rs.getString("DiaChi").trim()));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
	
	public void addCustomer(Customer cus) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("insert into KhachHang(MaKhachHang,TenKhachHang,SoDienThoai, DiaChi) values (?,?,?,?)");
			stmt.setString(1, cus.getMaKhachHang());
			stmt.setString(2, cus.getTenKhachHang());
			stmt.setString(3, cus.getDiaChi());
			stmt.setString(4, cus.getSoDienThoai());
			if(stmt.executeUpdate()==1)
				JOptionPane.showMessageDialog(null, "Đã lưu vào Database");
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Lưu thất bại");
			e.printStackTrace();
		}finally {
			stmt.close();
		}
	}
	
	public void deleteCustomer(int id) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		try {
			String sql = "delete from PhieuThu\r\n"
					+ "where MaHopDong = ?\r\n"
					+ "\r\n"
					+ "delete from PhieuNhanXetBaoHanh\r\n"
					+ "where MaHopDong = ?\r\n"
					+ "\r\n"
					+ "delete from ChiTietHopDong\r\n"
					+ "where MaHopDong = ?\r\n"
					+ "\r\n"
					+ "delete from HopDong\r\n"
					+ "where MaHopDong = ?\r\n"
					+ "delete from KhachHang where MaKhachHang = ?";
					
					
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setInt(2, id);
			ps.setInt(3, id);
			ps.setInt(4, id);
			ps.setInt(5, id);
			if(ps.executeUpdate()==1) {
				JOptionPane.showMessageDialog(null, "XÓA THÀNH CÔNG");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "XÓA THẤT BẠI");
			e.printStackTrace();
		}finally {
			ConnectDB.disconnect();
		}
	}
}
