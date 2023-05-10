package entity;

public class TechnicalEmp extends Employee{
	private String bacTho;
	private int soNamKinhNghiem;
	
	public TechnicalEmp(String maNhanVien, String tenNhanVien, String chucVu) {
		super(maNhanVien, tenNhanVien, chucVu);
		// TODO Auto-generated constructor stub
	}
	
	public TechnicalEmp(String maNhanVien, String tenNhanVien, String chucVu, String bacTho, int soNamKinhNghiem) {
		super(maNhanVien, tenNhanVien, chucVu);
		this.bacTho = bacTho;
		this.soNamKinhNghiem = soNamKinhNghiem;
	}

	public String getBacTho() {
		return bacTho;
	}

	public void setBacTho(String bacTho) {
		this.bacTho = bacTho;
	}

	public int getSoNamKinhNghiem() {
		return soNamKinhNghiem;
	}

	public void setSoNamKinhNghiem(int soNamKinhNghiem) {
		this.soNamKinhNghiem = soNamKinhNghiem;
	}
	
}
