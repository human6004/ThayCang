package KTCK;

import java.util.Scanner;

public class BNhan {
	private DVi dvi;
	private String ten;
	private String ngay;
	private float cnang;
	public BNhan() {
		dvi = new DVi();
		ten = new String();
		ngay = new String();
		cnang = 0.0f;
	}
	
	public BNhan(BNhan bn) {
		dvi = new DVi(bn.dvi);
		ten = new String(bn.ten);
		ngay = new String(bn.ngay);
		cnang = bn.cnang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		dvi.nhap();
		System.out.println("nhap ten benh nhan: ");
		ten = sc.nextLine();
		System.out.println("nhap ngay nhap vien: ");
		ngay = sc.nextLine();
		System.out.println("nhap can nang: ");
		cnang = sc.nextFloat();
	}
	
	public void xuat() {
		System.out.println("ten don vi dieu tri: " + dvi + "\nten benh nhan: "+ten+"\nngay nhap vien: "+ngay+"\ncan nang benh nhan: "+cnang);
		
	}
	
	public String toString() {
		return ("ten don vi dieu tri: " + dvi + "\nten benh nhan: "+ten+"\nngay nhap vien: "+ngay+"\ncan nang benh nhan: "+cnang);
	
	}
	
	public String getTen() {
		return ten; 
	}
	public String getNgay() {
		return ngay;
	}
	
	public String getMdv() {
		return dvi.getMdv();
	}
	
	public static void main(String[] args) {
//		BNhan benhNhan = new BNhan();
//		benhNhan.nhap();
//		benhNhan.xuat();
		System.out.println("nhap so luong phan tu mang:");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		BNhan bn[] = new BNhan[n];
		for(int i=0; i<n; i++) {
			bn[i] = new BNhan();
		}
		System.out.println("nhap thong tin:\n\n-------------------------");
		for(int i=0; i<n;i++) {
		bn[i].nhap();
		System.out.println("\n\n");
		}
		System.out.println("thong tin benh nhan:\n\n---------------------------");
		for(int i=0; i<n; i++) {
			bn[i].xuat();
			System.out.println("\n\n");
		}
		
		System.out.println("bệnh nhân cần tìm");
		for(int i=0; i<n; i++) {
			if(bn[i].getTen().equalsIgnoreCase("Tran Anh Hoa") && bn[i].getNgay().equals("21/11/2021")) {
				System.out.println(bn[i].getMdv());
				
			}
		}
	}
	
}
