package entity;

import java.time.LocalDate;

public class Statistical_contract {
	private int maHopDong;
	private LocalDate ngayHopDong;
	private Double doanhThu;
	
	public Statistical_contract(int maHopDong, LocalDate ngayHopDong, Double doanhThu) {
		super();
		this.maHopDong = maHopDong;
		this.ngayHopDong = ngayHopDong;
		this.doanhThu = doanhThu;
	}

	public int getMaHopDong() {
		return maHopDong;
	}

	public void setMaHopDong(int maHopDong) {
		this.maHopDong = maHopDong;
	}

	public LocalDate getNgayHopDong() {
		return ngayHopDong;
	}

	public void setNgayHopDong(LocalDate ngayHopDong) {
		this.ngayHopDong = ngayHopDong;
	}

	public Double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(Double doanhThu) {
		this.doanhThu = doanhThu;
	}
	
	
}
