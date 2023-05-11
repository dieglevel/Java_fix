package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import connectDB.ConnectDB;
import entity.AdministrationEmp;
import entity.Employee;
import entity.TechnicalEmp;
import entity.Warranty;

public class Employee_DAO {
	public ArrayList<AdministrationEmp> getAllAdEmployee() throws SQLException{
		ArrayList<AdministrationEmp> temp = new ArrayList<>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "select nv.MaNhanVien, TenNhanVien, ChucVu, PhongBan, TrinhDoHocVan from NhanVien nv join NhanVienHanhChinh nvhc on nv.MaNhanVien = nvhc.MaNhanVien";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				temp.add(new AdministrationEmp(rs.getString("MaNhanVien"), 
												rs.getString("TenNhanVien"), 
												rs.getString("ChucVu"), 
												rs.getString("PhongBan"), 
												rs.getString("TrinhDoHocVan")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
	public ArrayList<TechnicalEmp> getAllTechEmployee() throws SQLException{
		ArrayList<TechnicalEmp> temp = new ArrayList<>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "select nv.MaNhanVien, TenNhanVien, ChucVu, BacTho, SoNamKinhNghiem from NhanVien nv join NhanVienKiThuat nvkt on nv.MaNhanVien = nvkt.MaNhanVien";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				temp.add(new TechnicalEmp(rs.getString("MaNhanVien"), 
												rs.getString("TenNhanVien"), 
												rs.getString("ChucVu"), 
												rs.getString("BacTho"), 
												rs.getInt("SoNamKinhNghiem")));
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
			String sql = "select top 1 MaNhanVien from NhanVien order by MaNhanVien desc";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				ID = rs.getInt("MaNhanVien");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ID;
	}
	
	public void addEmployee(Employee e) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("insert into NhanVien(MaNhanVien, TenNhanVien, ChucVu) values (?,?,?)");
			stmt.setString(1, e.getMaNhanVien());
			stmt.setString(2, e.getTenNhanVien());
			stmt.setString(3, e.getChucVu());
			stmt.executeUpdate();
		}catch(SQLException e1) {
			e1.printStackTrace();
		}finally {
			stmt.close();
		}
	}
	
	public void addAdEmp(AdministrationEmp ae) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("insert into NhanVienHanhChinh(MaNhanVien, PhongBan, TrinhDoHocVan) values (?,?,?)");
			stmt.setString(1, ae.getMaNhanVien());
			stmt.setString(2, ae.getPhongBan());
			stmt.setString(3, ae.getHocVan());
			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			stmt.close();
		}
	}
	
	public void addTechEmp(TechnicalEmp te) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("insert into NhanVienKiThuat(MaNhanVien, BacTho, SoNamKinhNghiem) values (?,?,?)");
			stmt.setString(1, te.getMaNhanVien());
			stmt.setString(2, te.getBacTho());
			stmt.setInt(3, te.getSoNamKinhNghiem());
			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			stmt.close();
		}
	}
}
