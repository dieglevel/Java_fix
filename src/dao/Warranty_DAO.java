package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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
        
}
     