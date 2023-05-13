package entity;

import java.time.LocalDate;

public class Statistical_Motobike {
	private int maXe;
	private int thoiGian;
	private int soLuong;
	public Statistical_Motobike(int maXe, int thoiGian, int soLuong) {
		super();
		this.maXe = maXe;
		this.thoiGian = thoiGian;
		this.soLuong = soLuong;
	}
	public int getMaXe() {
		return maXe;
	}
	public void setMaXe(int maXe) {
		this.maXe = maXe;
	}
	public int getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(int thoiGian) {
		this.thoiGian = thoiGian;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	
}