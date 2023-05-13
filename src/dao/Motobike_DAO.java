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
import entity.Motobike;

public class Motobike_DAO {
	
	public ArrayList<Motobike> getAllMotobike() throws SQLException{
		ArrayList<Motobike> temp = new ArrayList<>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		ConnectDB.connect();
		try {
			String sql = "SELECT * FROM XeMay";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				temp.add(new Motobike(rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getDouble(4), 
						rs.getString(5), 
						rs.getString(6), 
						rs.getString(7), 
						rs.getDouble(8),
						rs.getString(9)));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		ConnectDB.disconnect();
		return temp;
	}
	
	public void addMoto(Motobike tmp) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		try {
			String sql = "insert into XeMay( MaXe,NuocSanXuat,LoaiXe,SoPK,SoKhung,SoSuon,MauXe,GiaXe,ThoiGianBaoHanh) \r\n"
					+ "values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, tmp.getMotobikeID());
			ps.setString(2, tmp.getCountryOfmanufacture());
			ps.setString(3, tmp.getRangeOfVehicle());
			ps.setDouble(4, tmp.getCubic());
			ps.setString(5,  tmp.getTheFrameOfTheMachine());
			ps.setString(6,  tmp.getNumberOfRibs());
			ps.setString(7,  tmp.getColor());
			ps.setDouble(8,  tmp.getMoney());
			ps.setString(9, tmp.getWarrantyPeriod());
			if(ps.executeUpdate() == 1) {
				JOptionPane.showMessageDialog(null,"THÊM THÀNH CÔNG");
                                dao.History_DAO.getInstance().historyInsert(ql_xe.GUI.employeeID, String.format("insert into XeMay (%s, %s, %s, %s, %s, %s, %s, %s, %s)", 
                                        String.valueOf(tmp.getMotobikeID()), String.valueOf(tmp.getCountryOfmanufacture()),
                                                String.valueOf(tmp.getRangeOfVehicle()), String.valueOf(tmp.getCubic()), String.valueOf(tmp.getTheFrameOfTheMachine())
                                                , String.valueOf(tmp.getNumberOfRibs())
                                                        , String.valueOf(tmp.getColor()),
                                                        String.valueOf(tmp.getMoney()),
                                                        String.valueOf(tmp.getWarrantyPeriod())
                                        ));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"THÊM THẤT BẠI");
			e.printStackTrace();
		}
	}
	
	public void deleteMoto(int id) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		try {
			String sql = "delete from PhieuNhanXetBaoHanh\r\n"
					+ "where MaXe = ?\r\n"
					+ "\r\n"
					+ "delete from ChiTietHopDong\r\n"
					+ "where MaXe = ?\r\n"
					+ "\r\n"
					+ "delete from XeMay\r\n"
					+ "where MaXe = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setInt(2, id);
			ps.setInt(3, id);
			if(ps.executeUpdate()==1) {
				JOptionPane.showMessageDialog(null, "XÓA THÀNH CÔNG");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "XÓA THẤT BẠI");
			e.printStackTrace();
		}
	}
	
	public int getMaxID() throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		
		int tmp = 0;
		try {
			String sql = "select top 1 MaXe from XeMay\r\n"
					+ "order by MaXe desc";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				tmp = rs.getInt(1);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "DATABASE EMPTY");
			e.printStackTrace();
		}
		return tmp;
	}
	
	public ArrayList<Motobike> search(String search) throws SQLException {
		ArrayList<Motobike> temp = new ArrayList<>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		
		try {
			String sql = "select MaXe,NuocSanXuat,LoaiXe,SoPK,SoKhung,SoSuon,MauXe,GiaXe,ThoiGianBaoHanh from XeMay\r\n"
					+ "where MaXe like ? or\r\n"
					+ "	NuocSanXuat like ? or\r\n"
					+ "	LoaiXe like ? or SoPK like ? or SoKhung like ? or SoSuon like ? or \r\n"
					+ "	MauXe like ? or GiaXe like ? or ThoiGianBaoHanh like ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"%"+ search + "%");
			ps.setString(2,"%"+ search + "%");
			ps.setString(3,"%"+ search + "%");
			ps.setString(4,"%"+ search + "%");
			ps.setString(5,"%"+ search + "%");
			ps.setString(6,"%"+ search + "%");
			ps.setString(7,"%"+ search + "%");
			ps.setString(8, "%"+ search + "%");
			ps.setString(9,"%"+ search + "%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				temp.add(new Motobike(rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getDouble(4), 
						rs.getString(5), 
						rs.getString(6), 
						rs.getString(7), 
						rs.getDouble(8),
						rs.getString(9)));
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Tim Loi");
			e.printStackTrace();
		}
		return temp;
	}
	
	public void update(String txt1,String txt2,String txt3,String txt4,String txt5,String txt6,String txt7,String txt8,String txt9) throws SQLException {
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnection();
		try {
			String sql = "update XeMay\r\n"
					+ "set NuocSanXuat= ?,LoaiXe= ?,SoPK= ?,SoKhung= ?,SoSuon= ?\r\n"
					+ ",MauXe= ?,GiaXe= ?,ThoiGianBaoHanh= ?\r\n"
					+ "where MaXe like ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,txt2);
			ps.setString(2,txt3);
			ps.setString(3,txt4);
			ps.setString(4,txt5);
			ps.setString(5,txt6);
			ps.setString(6,txt7);
			ps.setString(7,txt8);
			ps.setString(8,txt9);
			ps.setString(9,txt1);
			if(ps.executeUpdate()==1) {
				JOptionPane.showMessageDialog(null,"Cập nhật thành công");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Cập nhật thất bại");
			e.printStackTrace();
		}
	}
}
