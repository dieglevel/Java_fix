/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class ContractDetail {
    private int maChiTiet;
    private int maHopDong;
    private int maXe;
    private int soLuong;
    private double tongTien;

    public ContractDetail(int maChiTiet, int maHopDong, int maXe, int soLuong, double tongTien) {
        this.maChiTiet = maChiTiet;
        this.maHopDong = maHopDong;
        this.maXe = maXe;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
    }

    public int getMaChiTiet() {
        return maChiTiet;
    }

    public int getMaHopDong() {
        return maHopDong;
    }

    public int getMaXe() {
        return maXe;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setMaChiTiet(int maChiTiet) {
        this.maChiTiet = maChiTiet;
    }

    public void setMaHopDong(int maHopDong) {
        this.maHopDong = maHopDong;
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s", getMaChiTiet(), getMaHopDong(), getMaXe(), getSoLuong(), getTongTien());
	}

    
    
}
