package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import entity.Statistical_Motobike;
import entity.Statistical_contract;
import entity.Statistical_employee;

public class Statistical_DAO {
	public ArrayList<Statistical_contract> doanhThuTheoThang() throws SQLException{
		ArrayList<Statistical_contract> temp = new ArrayList<>();
		connectDB.ConnectDB.getInstance().connect();
		Connection con = connectDB.ConnectDB.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT MaHopDong, NgayHopDong, TienPhaiThanhToan FROM HopDong");
		while(rs.next()) {
			temp.add(new Statistical_contract(rs.getInt(1), LocalDate.parse(rs.getString(2).trim(), DateTimeFormatter.ofPattern("d-M-yyyy")) , rs.getDouble(3)));
			
		}
		return temp;
	}
	
	public ArrayList<Statistical_employee> nhanVienLapHopDongTheoThang() throws SQLException{
		ArrayList<Statistical_employee> temp = new ArrayList<>();
		connectDB.ConnectDB.getInstance().connect();
		Connection con = connectDB.ConnectDB.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT MaNhanVien, TenNhanVien, MONTH(GETDATE()) AS Thang , Count(MaHopDong) FROM HopDong a inner join NhanVien b on a.MaNhanVienLapHopDong = b.MaNhanVien \r\n"
				+ "WHERE MONTH(CONVERT(DATETIME,NgayHopDong ,105)) = MONTH(GETDATE()) and YEAR(CONVERT(DATETIME,NgayHopDong ,105)) = YEAR(GETDATE())\r\n"
				+ "GROUP BY MaNhanVien, TenNhanVien");
		while(rs.next()) {
			temp.add(new Statistical_employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
		}
		return temp;
	}
	
	public ArrayList<Statistical_employee> nhanVienLapHopDongTheoNam() throws SQLException{
		ArrayList<Statistical_employee> temp = new ArrayList<>();
		connectDB.ConnectDB.getInstance().connect();
		Connection con = connectDB.ConnectDB.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT MaNhanVien, TenNhanVien, YEAR(GETDATE()) AS Thang , Count(MaHopDong) FROM HopDong a inner join NhanVien b on a.MaNhanVienLapHopDong = b.MaNhanVien \r\n"
				+ "WHERE YEAR(CONVERT(DATETIME,NgayHopDong ,105)) = YEAR(GETDATE())\r\n"
				+ "GROUP BY MaNhanVien, TenNhanVien\r\n"
				+ "");
		while(rs.next()) {
			temp.add(new Statistical_employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
		}
		return temp;
	}
	
	public ArrayList<Statistical_Motobike> soXeBanDuocTheoThang() throws SQLException{
		ArrayList<Statistical_Motobike> temp = new ArrayList<>();
		connectDB.ConnectDB.getInstance().connect();
		Connection con = connectDB.ConnectDB.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT MaXe, MONTH(GETDATE()) AS THANG, SUM(CONVERT(int, SoLuong)) FROM HopDong a inner join ChiTietHopDong b on a.MaHopDong = b.MaHopDong\r\n"
				+ "WHERE MONTH(CONVERT(DATETIME,NgayHopDong, 105)) = MONTH(GETDATE()) and YEAR(CONVERT(DATETIME,NgayHopDong ,105)) = YEAR(GETDATE())\r\n"
				+ "GROUP BY MaXe");
		while(rs.next()) {
			temp.add(new Statistical_Motobike(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
		}
		return temp;
	}
	
	public ArrayList<Statistical_Motobike> soXeBanDuocTheoNam() throws SQLException{
		ArrayList<Statistical_Motobike> temp = new ArrayList<>();
		connectDB.ConnectDB.getInstance().connect();
		Connection con = connectDB.ConnectDB.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT MaXe, YEAR(GETDATE()) AS THANG, SUM(CONVERT(int, SoLuong)) FROM HopDong a inner join ChiTietHopDong b on a.MaHopDong = b.MaHopDong\r\n"
				+ "WHERE YEAR(CONVERT(DATETIME,NgayHopDong ,105)) = YEAR(GETDATE())\r\n"
				+ "GROUP BY MaXe");
		while(rs.next()) {
			temp.add(new Statistical_Motobike(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
		}
		return temp;
	}
}
