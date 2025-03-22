package buoi5;

import java.util.Scanner;

public class KhachHang {
	private String cccd;
	private String hten;
	private String dchi;

	public KhachHang() {
		cccd = new String();
		hten = new String();
		dchi = new String();

	}

	public KhachHang(String cccd, String hten, String dchi) {
		this.cccd = new String(cccd);
		this.hten = new String(hten);
		this.dchi = new String(dchi);
	}

	public KhachHang(KhachHang kh) {
		this.cccd = new String(kh.cccd);
		this.hten = new String(kh.hten);
		this.dchi = new String(kh.dchi);
	}
		

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getHten() {
		return hten;
	}

	public void setHten(String hten) {
		this.hten = hten;
	}

	public String getDchi() {
		return dchi;
	}

	public void setDchi(String dchi) {
		this.dchi = dchi;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap cccd: ");
		cccd = sc.nextLine();
		System.out.println("nhap ho va ten: ");
		hten = sc.nextLine();
		System.out.println("mhap dia chi: ");
		dchi = sc.nextLine();
	}

	public void in() {
		System.out.println("thong tin khach hang:\n" + "cccd: " + cccd + "\nho ten: " + hten + "\ndia chi: " + dchi);
	}

	public String toString() {
		return ("thong tin khach hang:\n" + "cccd: " + cccd + "\nho ten: " + hten + "\ndia chi: " + dchi);
	}
	


    public float getDiscount() {
        return 0;
    }
}
