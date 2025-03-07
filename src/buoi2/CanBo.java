package buoi2;

import java.util.Scanner;

public class CanBo {
	private int maso;
	private String hoten;
	private Date ngaysinh;
	private int thamnien;
	private char xeploai;

	// hàm xây dựng ko có đối số
	public CanBo() {
		maso = 0;
		hoten = new String("");
		ngaysinh = new Date();
		thamnien = 0;
		xeploai = 'C';
	}

	// hàm xâ dựng có đối số
	public CanBo(int maso1, String hoten, Date ngaysinh, int thamnien, char xeploai) {
		maso = maso1; // ví dụ khai báo khác
		this.hoten = new String(hoten);// đây là kiểu dữ liệu đối tượng nên cần cấp phát bộ nhớ
		this.ngaysinh = new Date(ngaysinh);// đây là kiểu dữ liệu đối tượng nên cần cấp phát bộ nhớ
		this.thamnien = thamnien;
		this.xeploai = xeploai;
	}

	// hàm xây dựng sao chép
	public CanBo(CanBo a) {
		maso = a.maso;
		hoten = new String(a.hoten);
		ngaysinh = new Date(a.ngaysinh);
		thamnien = a.thamnien;
		xeploai = a.xeploai;

	}

	public void in() {
		System.out.println("[MS: " + maso + ", Ten: " + hoten + ", ngaysinh: " + ngaysinh + ", thamnien: " + thamnien
				+ ", xeploai: " + xeploai + "]");

	}

	public String toString() {
		return "[MS: " + maso + ", Ten: " + hoten + ", ngaysinh: " + ngaysinh + ", thamnien: " + thamnien
				+ ", xeploai: " + xeploai + "]";
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so can bo: ");
		maso = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap ho ten can bo: ");
		hoten = sc.nextLine();
		System.out.print("Nhap tham nien can bo: ");
		thamnien = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap xep loai can bo: ");
		xeploai = sc.nextLine().charAt(0);
	}

	public long khenThuong() {
		return thamnien * ((xeploai == 'A') ? 1000000 : (xeploai == 'B') ? 500000 : 0);
	}

}
