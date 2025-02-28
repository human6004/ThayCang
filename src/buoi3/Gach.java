package buoi3;

import java.util.Scanner;

public class Gach {
	private String maSo;
	private String mau;
	private int chieuDaiVienGach;// cm
	private int chieuNgangVienGach;// cm
	private long giaBan;

	// ham xay dunng mac nhien ko doi so
	public Gach() {
		maSo = new String(" ");
		mau = new String(" ");
		chieuDaiVienGach = 0;
		chieuNgangVienGach = 0;
		giaBan = 0;
	}

	// ham xay dung mac nhien co doi so
	public Gach(String maSo, String mau, int chieuDaiVienGach, int chieuNgangVienGach, long giaBan) {
		this.maSo = new String(maSo);
		this.mau = new String(maSo);
		this.chieuDaiVienGach = chieuDaiVienGach;
		this.chieuNgangVienGach = chieuNgangVienGach;
		this.giaBan = giaBan;
	}

	// ham xay dung sao chep
	public Gach(Gach g) {
		maSo = g.maSo;
		mau = g.mau;
		chieuDaiVienGach = g.chieuDaiVienGach;
		chieuNgangVienGach = g.chieuNgangVienGach;
		giaBan = g.giaBan;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap maso: ");
		maSo = sc.nextLine();
		System.out.println("nhap mau: ");
		mau = sc.nextLine();
		System.out.println("nhap chieu Dai Vien Gach: ");
		chieuDaiVienGach = sc.nextInt();
		System.out.println("nhap chieu Ngang Vien Gach: ");
		chieuNgangVienGach = sc.nextInt();
		System.out.println("nhap gia ban: ");
		giaBan = sc.nextLong();
	}

	public void in() {
		System.out.println("ma so: " + maSo + ", mau: " + mau + ", chieu dai: " + chieuDaiVienGach + ", chieu ngang: "
				+ chieuNgangVienGach + ", gia ban: ");
	}
	
	public String toString() {
		return ("ma so: " + maSo + ", mau: " + mau + ", chieu dai: " + chieuDaiVienGach + ", chieu ngang: "
				+ chieuNgangVienGach + ", gia ban: ");
	}

}
