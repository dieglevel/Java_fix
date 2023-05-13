package entity;

import java.time.LocalDate;

public class Warranty {
	private String maBaoHanh;
	private String maHopDong;
	private String maXe;
	private String maNhanVien;
	private LocalDate ngayBaoHanh;
	private String tenLinhKien;
	private String loiBaoHanh;
	private double soTien;
	
	
	public Warranty(String maBaoHanh, String maHopDong, String maXe, String maNhanVien, LocalDate ngayBaoHanh,
			String tenLinhKien, String loiBaoHanh, double soTien) {
		this.maBaoHanh = maBaoHanh;
		this.maHopDong = maHopDong;
		this.maXe = maXe;
		this.maNhanVien = maNhanVien;
		this.ngayBaoHanh = ngayBaoHanh;
		this.tenLinhKien = tenLinhKien;
		this.loiBaoHanh = loiBaoHanh;
		this.soTien = soTien;
	}
	public String getMaBaoHanh() {
		return maBaoHanh;
	}
	public void setMaBaoHanh(String maBaoHanh) {
		this.maBaoHanh = maBaoHanh;
	}
	public String getMaHopDong() {
		return maHopDong;
	}
	public void setMaHopDong(String maHopDong) {
		this.maHopDong = maHopDong;
	}
	public String getMaXe() {
		return maXe;
	}
	public void setMaXe(String maXe) {
		this.maXe = maXe;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public LocalDate getNgayBaoHanh() {
		return ngayBaoHanh;
	}
	public void setNgayBaoHanh(LocalDate ngayBaoHanh) {
		this.ngayBaoHanh = ngayBaoHanh;
	}
	public String getTenLinhKien() {
		return tenLinhKien;
	}
	public void setTenLinhKien(String tenLinhKien) {
		this.tenLinhKien = tenLinhKien;
	}
	public String getLoiBaoHanh() {
		return loiBaoHanh;
	}
	public void setLoiBaoHanh(String loiBaoHanh) {
		this.loiBaoHanh = loiBaoHanh;
	}
	public double getSoTien() {
		return soTien;
	}
	public void setSoTien(double soTien) {
		this.soTien = soTien;
	}
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s", getMaBaoHanh(), getMaHopDong(), getMaXe(), getMaNhanVien(), getNgayBaoHanh(), getTenLinhKien(), getLoiBaoHanh(), getSoTien());
	}
	
	
}
