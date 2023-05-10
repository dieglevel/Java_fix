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
import entity.Contract;
import entity.Motobike;
//import java.sql.Statement;

public class Contract_DAO {
	
	public ArrayList<Contract> getAllContract() throws SQLException{
		ArrayList<Contract> list = new ArrayList<Contract>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "SELECT MaHopDong,MaKhachHang,NgayHopDong,MaNhanVienLapHopDong,TienPhaiThanhToan,\r\n"
					+ "TiLeGiamGia,TienDaThanhToan,SoLanTraGop,PhuongThucThanhToan FROM HopDong";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				list.add(new Contract(
						rs.getInt(1),
						rs.getInt(2),
						LocalDate.parse(rs.getString(3).trim(), DateTimeFormatter.ofPattern("d-M-yyyy")),
						rs.getInt(4),
						Double.parseDouble(rs.getString(5).trim()),
						Float.parseFloat(rs.getString(6).trim().substring(0,rs.getString(6).trim().length()-1))/10,
						Double.parseDouble(rs.getString(7).trim()),
						Integer.parseInt(rs.getString(8).trim()),
						rs.getString(9)
					));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		ConnectDB.disconnect();
		return list;
	}
	
	public void addContract(Contract contract) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "insert into HopDong\r\n"
					+ "(\r\n"
					+ "	MaHopDong,MaKhachHang,MaNhanVienLapHopDong,NgayHopDong,TienPhaiThanhToan,\r\n"
					+ "	TiLeGiamGia,TienDaThanhToan,PhuongThucThanhToan,SoLanTraGop\r\n"
					+ "\r\n"
					+ ")values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,contract.getContractID());
			ps.setInt(2,contract.getCustomerID());
			ps.setInt(3,contract.getStaffID());
			String date = contract.getContractDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")).toString();
			ps.setString(4,date);
			System.out.println(date);
			ps.setString(5, Double.toString(contract.getMoneyPay()));
			ps.setString(6, Float.toString(contract.getDiscount()));
			ps.setString(7, Double.toString(contract.getMoneypaied()));
			ps.setString(8,contract.getMethodPayment());
			ps.setInt(9, contract.getTimePay());
			if(ps.executeUpdate() == 1) {
				JOptionPane.showMessageDialog(null, "Lưu Thành Công");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Lưu That Bai");
			e.printStackTrace();
		}
		finally {
			ConnectDB.disconnect();
		}
		
	}
	
	public void deleteContract(int value) throws SQLException {
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
					+ "";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1,value);
			ps.setInt(2,value);
			ps.setInt(3,value);
			ps.setInt(4,value);
			if(ps.executeUpdate() == 1) {
				JOptionPane.showMessageDialog(null,"Xoa thanh cong");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Xoa That Bai");
			e.printStackTrace();
		}
	}
        
        public int getLastID() throws SQLException{
            
            ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "SELECT top 1 MaHopDong FROM HopDong order by MaHopDong desc";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
                        rs.next();
                        return rs.getInt(1)+1;
                                
		}catch(Exception e) {
                        return 1;
		}
                finally{
                    	ConnectDB.disconnect();
                        
                }

                
        }
}
