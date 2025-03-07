package buoi3;

import java.util.Scanner;

public class Gach {
	private String maSo;
	private String mau;
	private int soLuong;
	private int chieuDaiVienGach;// cm
	private int chieuNgangVienGach;// cm
	private long giaBan;

	// ham xay dunng mac nhien ko doi so
	public Gach() {
		maSo = new String(" ");
		mau = new String(" ");
		soLuong = 0;
		chieuDaiVienGach = 0;
		chieuNgangVienGach = 0;
		giaBan = 0;
	}

	// ham xay dung mac nhien co doi so
	public Gach(String maSo, String mau, int chieuDaiVienGach, int chieuNgangVienGach, long giaBan) {
		this.maSo = new String(maSo);
		this.mau = new String(maSo);
		this.soLuong = soLuong;
		this.chieuDaiVienGach = chieuDaiVienGach;
		this.chieuNgangVienGach = chieuNgangVienGach;
		this.giaBan = giaBan;
	}

	// ham xay dung sao chep
	public Gach(Gach g) {
		maSo = new String(g.maSo);
		mau = new String(g.mau);
		soLuong = g.soLuong;
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

	public float giaBanLe() {
//		float giaLe = ((float) giaBan/100) *120;
		return giaBan * 1.2f / soLuong;
	}

	public long dienTichLot() {
		long dienTich = chieuDaiVienGach * chieuNgangVienGach;
		return soLuong * dienTich;
	}

	public long layGia() {
		return giaBan;
	}

	public float giaDienTich() {
		return (float) giaBan / dienTichLot();
	}

	public int soLuongHop(int D, int N) {
		double dientich = D * N;
		double soHop = dientich / dienTichLot();
		return (int) Math.ceil(soHop);
	}

}
