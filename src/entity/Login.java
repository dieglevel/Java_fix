/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Login {
    private int maTaiKhoan;
    private int maNhanVien;
    private String tenNhanVien;
    private String matKhau;
    private int mucDoUuTien;

    public Login(int maTaiKhoan, int maNhanVien, String tenNhanVien, String matKhau, int mucDoUuTien) {
        this.maTaiKhoan = maTaiKhoan;
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.matKhau = matKhau;
        this.mucDoUuTien = mucDoUuTien;
    }

    public int getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(int maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
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

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getMucDoUuTien() {
        return mucDoUuTien;
    }

    public void setMucDoUuTien(int mucDoUuTien) {
        this.mucDoUuTien = mucDoUuTien;
    }

    @Override
    public String toString() {
        return "Login{" + "maTaiKhoan=" + maTaiKhoan + ", maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", matKhau=" + matKhau + ", mucDoUuTien=" + mucDoUuTien + '}';
    }
    
    
}
