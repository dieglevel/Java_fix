package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

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
		return ID+1;
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
			if(stmt.executeUpdate()==1) {
				dao.History_DAO.getInstance().historyInsert(ql_xe.GUI.employeeID, "Insert "+ ae.toString());
			}
			
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
			if(stmt.executeUpdate()==1) {
				dao.History_DAO.getInstance().historyInsert(ql_xe.GUI.employeeID, "Insert "+te.toString());
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			stmt.close();
		}
	}
	
	public void updateEmp(int iD, String newName) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
			String sql = "UPDATE NhanVien\r\n"
					+ "set TenNhanVien = ?\r\n"
					+ "FROM NhanVien\r\n"
					+ "WHERE MaNhanVien = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newName);
			ps.setInt(2, iD);
			ps.executeUpdate();
	}
	
	public void updateAdEmp(int iD, String newDepartment, String newLevel) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "UPDATE NhanVienHanhChinh\r\n"
					+ "set PhongBan = ?, TrinhDoHocVan = ?\r\n"
					+ "FROM NhanVienHanhChinh\r\n"
					+ "WHERE MaNhanVien = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newDepartment);
			ps.setString(2, newLevel);
			ps.setInt(3, iD);
			if(ps.executeUpdate()>0)
				JOptionPane.showMessageDialog(null, "CẬP NHẬT THÀNH CÔNG");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "CẬP NHẬT THẤT BẠI");
			e.printStackTrace();
		}
	}
	
	public void updateTechEmp(int iD, String newRank, String newYear) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "UPDATE NhanVienKiThuat\r\n"
					+ "set BacTho = ?, SoNamKinhNghiem = ?\r\n"
					+ "FROM NhanVienKiThuat\r\n"
					+ "WHERE MaNhanVien = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newRank);
			ps.setString(2, newYear);
			ps.setInt(3, iD);
			if(ps.executeUpdate()>0)
				JOptionPane.showMessageDialog(null, "CẬP NHẬT THÀNH CÔNG");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "CẬP NHẬT THẤT BẠI");
			e.printStackTrace();
		}
	}
	
	public ArrayList<AdministrationEmp> searchAdEmp(String dataSearch) throws SQLException {
		ArrayList<AdministrationEmp> temp = new ArrayList<>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "select nv.MaNhanVien, TenNhanVien, ChucVu, PhongBan, TrinhDoHocVan \r\n"
					+ "from NhanVien nv join NhanVienHanhChinh nvhc on nv.MaNhanVien = nvhc.MaNhanVien\r\n"
					+ "where nvhc.MaNhanVien like ? or\r\n"
					+ "TenNhanVien like ? or\r\n"
					+ "ChucVu like ? or\r\n"
					+ "PhongBan like ? or\r\n"
					+ "TrinhDoHocVan like ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"%"+ dataSearch + "%");
			ps.setString(2,"%"+ dataSearch + "%");
			ps.setString(3,"%"+ dataSearch + "%");
			ps.setString(4,"%"+ dataSearch + "%");
			ps.setString(5,"%"+ dataSearch + "%");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				temp.add(new AdministrationEmp(rs.getString("MaNhanVien"), rs.getString("TenNhanVien"), rs.getString("ChucVu"),
						rs.getString("PhongBan"), rs.getString("TrinhDoHocVan")));
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Không tìm thấy");
			e.printStackTrace();
		}
		return temp;
	}
	
	public ArrayList<TechnicalEmp> searchTechEmp(String dataSearch) throws SQLException {
		ArrayList<TechnicalEmp> temp = new ArrayList<>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "select nv.MaNhanVien, TenNhanVien, ChucVu, BacTho, SoNamKinhNghiem \r\n"
					+ "from NhanVien nv join NhanVienKiThuat nvkt on nv.MaNhanVien = nvkt.MaNhanVien\r\n"
					+ "where nvhc.MaNhanVien like ? or\r\n"
					+ "TenNhanVien like ? or\r\n"
					+ "ChucVu like ? or\r\n"
					+ "BacTho like ? or\r\n"
					+ "SoNamKinhNghiem like ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"%"+ dataSearch + "%");
			ps.setString(2,"%"+ dataSearch + "%");
			ps.setString(3,"%"+ dataSearch + "%");
			ps.setString(4,"%"+ dataSearch + "%");
			ps.setString(5,"%"+ dataSearch + "%");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				temp.add(new TechnicalEmp(rs.getString("MaNhanVien"), rs.getString("TenNhanVien"), rs.getString("ChucVu"),
						rs.getString("BacTho"), Integer.parseInt(rs.getString("TrinhDoHocVan"))));
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Không tìm thấy");
			e.printStackTrace();
		}
		return temp;
	}
}
