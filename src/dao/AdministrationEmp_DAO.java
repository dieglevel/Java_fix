package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import connectDB.ConnectDB;
import entity.AdministrationEmp;

public class AdministrationEmp_DAO {
	public ArrayList<AdministrationEmp> getAllEmployee() throws SQLException{
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
}
