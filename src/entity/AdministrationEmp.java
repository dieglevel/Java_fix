package entity;

public class AdministrationEmp extends Employee{
	
	private String phongBan;
	private String hocVan;
	
	public AdministrationEmp(String maNhanVien, String tenNhanVien, String chucVu) {
		super(maNhanVien, tenNhanVien, chucVu);
		// TODO Auto-generated constructor stub
	}

	public AdministrationEmp(String maNhanVien, String tenNhanVien, String chucVu, String phongBan, String hocVan) {
		super(maNhanVien, tenNhanVien, chucVu);
		this.phongBan = phongBan;
		this.hocVan = hocVan;
	}

	public String getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}

	public String getHocVan() {
		return hocVan;
	}

	public void setHocVan(String hocVan) {
		this.hocVan = hocVan;
	}

	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s", getMaNhanVien(), getTenNhanVien(), getChucVu(), getPhongBan(), getHocVan());	
	}
	
	
}