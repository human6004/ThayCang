package KTCK;

import java.util.Scanner;

public class DVi {
	public String mdv, tendv;
	public int sogiuong;
	public boolean dchien;
	
	
	public DVi(String mdv, String tendv, int sogiuong, boolean dchien) {
		this.mdv = new String(mdv);
		this.tendv = new String(tendv);
		this.sogiuong = sogiuong;
		this.dchien = dchien;
	}
	public DVi() {
		mdv = new String();
		tendv = new String();
		sogiuong = 0;
		dchien = true;
		
	}
	
	public DVi(DVi dvi) {
		mdv = new String(dvi.mdv);
		tendv = new String(dvi.tendv);
		sogiuong = dvi.sogiuong;
		dchien = dvi.dchien;
		
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma don vi: ");
		mdv = sc.nextLine();
		System.out.println("nhap tên don vi: ");
		tendv = sc.nextLine();
		System.out.println("nhap so giuong benh: ");
		sogiuong = sc.nextInt();
		System.out.println("trang thai benh vien da chien: ");
		dchien = sc.nextBoolean();
	}
	
	public void xuat() {
		System.out.println("ma don vi: "+mdv+"\nten don vi: "+tendv+"\nso giuong benh: "+sogiuong+"\ntrang thai: " +dchien);
	}
	
	public String toString() {
		return ("ma don vi: "+mdv+"\nten don vi: "+tendv+"\nso giuong benh: "+sogiuong+"\ntrang thai: " +dchien);
	}
	
	public String getMdv(){
		return mdv;
	}
	
	public static void main(String[] args) {
		DVi dv1 = new  DVi();
		dv1.nhap();
		dv1.xuat();
		DVi dv2 = new DVi(dv1);
		System.out.println("\n\n hàm sao chép : ");
		dv2.xuat();
	}
}
