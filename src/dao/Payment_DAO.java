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
import entity.Payment;

public class Payment_DAO {
	private ArrayList<Payment> list;
	public ArrayList<Payment> getAllPayment() throws SQLException{
		list = new ArrayList<>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		try {
			String sql = "select MaThanhToan,MaHopDong,NgayTra,SoTien,NguoiNhan,TenNguoiTra from PhieuThu";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				list.add(new Payment(
						rs.getInt(1),
						rs.getInt(2),
						LocalDate.parse(rs.getString(3).trim(),DateTimeFormatter.ofPattern("d-M-yyyy")),
						Double.parseDouble(rs.getString(4)),
						rs.getString(5),
						rs.getString(6)
					));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectDB.disconnect();
		return list;
	}
	
	public void addPayment(Payment pay) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		String sql = "insert into PhieuThu\r\n"
				+ "(\r\n"
				+ "	 MaThanhToan,MaHopDong,NgayTra,SoTien,NguoiNhan,TenNguoiTra\r\n"
				+ ")\r\n"
				+ "values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, pay.getPaymentID());
			ps.setInt(2, pay.getContractID());
			ps.setString(3, pay.getPaymentDate().format(DateTimeFormatter.ofPattern("d-M-yyyy")));
			ps.setString(4, pay.getMoneyPay().toString());
			ps.setString(5,pay.getPersionTake());
			ps.setString(6,pay.getPersionTake());
			if(ps.executeUpdate()==1) {
				JOptionPane.showMessageDialog(null, "THÊM THÀNH CÔNG");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "THÊM THẤT BẠI");
			e.printStackTrace();
		}
		ConnectDB.disconnect();
	}
	
	public Payment maxID() throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		Payment tmp = null;
		try {
			String sql = "select TOP 1 MaThanhToan,MaHopDong,NgayTra,SoTien,NguoiNhan,TenNguoiTra from PhieuThu\r\n"
					+ "order by MaThanhToan desc";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				tmp = new Payment(
						rs.getInt(1),
						rs.getInt(2),
						LocalDate.parse(rs.getString(3).trim(),DateTimeFormatter.ofPattern("d-M-yyyy")),
						Double.parseDouble(rs.getString(4)),
						rs.getString(5),
						rs.getString(6));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectDB.disconnect();
		return tmp;
		
	}
	
	public void deletePay(int id) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		try {
			String sql = "\r\n"
					+ "delete PhieuThu\r\n"
					+ "where MaThanhToan = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
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
