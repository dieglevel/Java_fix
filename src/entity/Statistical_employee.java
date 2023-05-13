package entity;

import java.time.LocalDate;

public class Statistical_employee {
	private int maNhanVien;
	private String tenNhanVien;
	private int ngayHopDong;
	private int soLuongHopDong;
	
	public Statistical_employee(int maNhanVien, String tenNhanVien, int ngayHopDong, int soLuongHopDong) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.ngayHopDong = ngayHopDong;
		this.soLuongHopDong = soLuongHopDong;
	}

	public int getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public int getNgayHopDong() {
		return ngayHopDong;
	}

	public void setNgayHopDong(int ngayHopDong) {
		this.ngayHopDong = ngayHopDong;
	}

	public int getSoLuongHopDong() {
		return soLuongHopDong;
	}

	public void setSoLuongHopDong(int soLuongHopDong) {
		this.soLuongHopDong = soLuongHopDong;
	}

	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s", getMaNhanVien(),getTenNhanVien(),getNgayHopDong(),getSoLuongHopDong());
	}
	
	
}