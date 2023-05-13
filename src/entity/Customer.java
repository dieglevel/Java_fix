package entity;

public class Customer {
	private String maKhachHang;
	private String tenKhachHang;
	private String soDienThoai;
	private String diaChi;
	
	
	public Customer() {

	}
	
	
	public Customer(String maKhachHang, String tenKhachHang, String soDienThoai, String diaChi) {
		super();
		this.maKhachHang = maKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
	}


	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}


	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s", getMaKhachHang(), getTenKhachHang(), getDiaChi(), getSoDienThoai());
	}
	
	
}
