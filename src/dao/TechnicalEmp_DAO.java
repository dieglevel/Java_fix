package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import connectDB.ConnectDB;
import entity.AdministrationEmp;
import entity.TechnicalEmp;

public class TechnicalEmp_DAO {
	public ArrayList<TechnicalEmp> getAllEmployee() throws SQLException{
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
}
