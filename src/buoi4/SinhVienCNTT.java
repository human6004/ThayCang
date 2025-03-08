package buoi4;

import java.lang.classfile.instruction.ReturnInstruction;
import java.util.Scanner;

import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {
	public String taikhoan;
	public String matkhau;
	public String email;

	public SinhVienCNTT() {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}

	public SinhVienCNTT(String taikhoan, String matkhau, String email) {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}

	public SinhVienCNTT(SinhVienCNTT sv) {
		super();
		taikhoan = new String(sv.taikhoan);
		matkhau = new String(sv.matkhau);
		email = new String(sv.email);
	}

	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap tai khoan: ");
		taikhoan = sc.nextLine();
		System.out.println("nhap mat khau: ");
		matkhau = sc.nextLine();
		System.out.println("nhap nhap email: ");
		email = sc.nextLine();

	}

	public void in() {
		super.in();
		System.out.println(", tkhoan: " + taikhoan + ", email" + email);
	}

	public String toString() {
		return super.toString() + (", tkhoan: " + taikhoan + ", email" + email);
	}

	public String layEmail() {
		return email;
	}

	public String layTKhoan() {
		return taikhoan;
	}

	public void doiMatKhau(String mk) {
		matkhau = new String(mk);
	}

}
