package KTCK;

import java.util.Scanner;

public class BNCovid extends BNhan2 {
	private String ngay;
	private char loai;
	private String odich,noi;
	public BNCovid() {
		super();
		ngay = new String();
		loai = ' ';
		odich = new String();
		noi = new String();
	}
	public BNCovid(String hten, boolean gtinh, int nsinh, float cnang, String ngay, char loai, String odich,
			String noi) {
		super(hten, gtinh, nsinh, cnang);
		this.ngay = ngay;
		this.loai = loai;
		this.odich = odich;
		this.noi = noi;
	}
	
	public BNCovid(BNCovid bn) {
		super(bn);
		ngay = new String(bn.ngay);
		loai = bn.loai;
		odich = new String(bn.odich);
		noi = new String(bn.noi);
	}
	
	public String getOdich() {
		return odich;
	}
	public char getLoai() {
		return loai;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("nhap ngay cach ly(DD-MM-YYYY): ");
		ngay = sc.nextLine();
		System.out.println("nhap loai nguoi nhiem: ");
		loai = sc.nextLine().charAt(0);
		System.out.println("nhap o dich: ");
		odich = sc.nextLine();
		System.out.println("nhap noi cach ly: ");
		noi = sc.nextLine();
	}
	
	public void in() {
		super.in();
		System.out.println("ngay cach ly: "+ngay);
		System.out.println("loai nguoi nhiem: "+loai);
		System.out.println("o dich: "+odich);
		System.out.println("noi cach ly "+noi);
	}
	public static void main(String[] args) {
//		BNCovid bn = new BNCovid();
//		bn.nhap();
//		bn.in();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so luong danh sach mang: ");
		int n = sc.nextInt();
		BNCovid ds[] = new BNCovid[n];
		
		for(int i=0; i<n;i++) {
			ds[i] = new BNCovid();
		}
		System.out.println("---------------------------------------------------------------");
		for(int i =0; i<n;i++) {
			System.out.println(" nhap benh nhan thu "+(i+1));
			ds[i].nhap();
		}
		System.out.println("---------------------------------------------------------------");

		for(int i=0; i<n; i++) {
		System.out.println("benh nhap thu"+(i+1)+"\n");
		ds[i].in();
		}
		
		System.out.println("Ho ten cua benh nhan COVID-19 loai F1 tai o dich \"cong ty hosiden\"");
		for(int i=0; i<n; i++) {
			if(ds[i].getOdich().equals("cong ty hosiden") && ds[i].getLoai()=='0')
				System.out.println(ds[i].getHten());
		}
	}
	
	
}
