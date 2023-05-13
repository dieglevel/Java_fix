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
			if(stmt.executeUpdate()==1) {
				dao.History_DAO.getInstance().historyInsert(ql_xe.GUI.employeeID, "Insert "+cus.toString());
				JOptionPane.showMessageDialog(null, "Đã lưu vào Database");
			}
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Lưu thất bại");
			e.printStackTrace();
		}finally {
			stmt.close();
		}
	}
	
	public int getID() throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		int ID = 0;
		try {
			String sql = "SELECT TOP 1 MaKhachHang FROM KhachHang order by MaKhachHang desc";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				ID = rs.getInt("MaKhachHang");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ID;
	}
	
	public void updateCustomer(int iD, String newName, String newAddress, String newPhone) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "update KhachHang\r\n"
					+ "set TenKhachHang = ?, DiaChi = ?, SoDienThoai = ?\r\n"
					+ "where MaKhachHang = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newName);
			ps.setString(2, newAddress);
			ps.setString(3, newPhone);
			ps.setInt(4, iD);
			if(ps.executeUpdate()>0)
				JOptionPane.showMessageDialog(null, "CẬP NHẬT THÀNH CÔNG");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "CẬP NHẬT THẤT BẠI");
			e.printStackTrace();
		}
	}
	
	public ArrayList<Customer> searchCustomer(String dataSearch) throws SQLException {
		ArrayList<Customer> temp = new ArrayList<>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "select *from KhachHang \r\n"
					+ "where MaKhachHang like ?\r\n"
					+ "or TenKhachHang like ?\r\n"
					+ "or DiaChi like ?\r\n"
					+ "or SoDienThoai like ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"%"+ dataSearch + "%");
			ps.setString(2,"%"+ dataSearch + "%");
			ps.setString(3,"%"+ dataSearch + "%");
			ps.setString(4,"%"+ dataSearch + "%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				temp.add(new Customer(rs.getString("MaKhachHang"), 
										rs.getString("TenKhachHang"), 
										rs.getString("DiaChi"), 
										rs.getString("SoDienThoai")));
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Không tìm thấy");
			e.printStackTrace();
		}
		return temp;
	}
}
