package KTCK;

import java.util.Scanner;

import buoi01.bai4;

public class BNhan2 {
	private String hten;
	private boolean gtinh;
	private int nsinh;
	private float cnang;

	public BNhan2(String hten, boolean gtinh, int nsinh, float cnang) {
		this.hten = hten;
		this.gtinh = gtinh;
		this.nsinh = nsinh;
		this.cnang = cnang;
	}

	public BNhan2() {
		hten = new String();
		gtinh = false;
		nsinh = 0;
		cnang = 0.0f;
	}

	public BNhan2(BNhan2 bn) {
		hten = new String(bn.hten);
		gtinh = bn.gtinh;
		nsinh = bn.nsinh;
		cnang = bn.cnang;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ho ten benh nhan: ");
		hten = sc.nextLine();
		System.out.println("nhap gioi tinh benh nhan: nu (false) or nam (true): ");
		gtinh = sc.nextBoolean();
		System.out.println("nhap nam sinh: ");
		nsinh = sc.nextInt();
		System.out.println("nhap can nang: ");
		cnang = sc.nextFloat();
	}
	
	public void in() {
		System.out.println("ho ten benh nhan: "+ hten);
		System.out.print("gioi tinh: ");
		if(gtinh) {
			System.out.println("nam");
		}
		else
			System.out.println("nu");
		System.out.println("nam sinh: "+nsinh);
		System.out.println("can nang: "+ cnang);
	}
	public String toString() {
		String gioitinh = gtinh ? "nam" : "nu";
		return "ho ten benh nhan: "+hten+ "\n"+
				"gioi tinh: " + gioitinh+"\n"+
				"nam sinh: " + nsinh + "\n"+
				"can nang: " +cnang;
	}
	public String getHten() {
		return hten;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BNhan2 bn1 = new BNhan2();
		bn1.nhap();
		bn1.in();
		System.out.println("\nhàm sao chép:");
		BNhan2 bn2 = new BNhan2(bn1);
//		bn2.in();
		System.out.println(bn2);
	}
	
	

}
