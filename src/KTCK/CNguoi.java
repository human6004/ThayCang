package KTCK;

import java.util.Scanner;

public class CNguoi {
	private String id,hten,ngay;
	private char phai;
	
	
	public CNguoi() {
		id = new String();
		hten = new String();
		ngay = new String();
		phai =' ';
	}
	
	public CNguoi(CNguoi cn) {
		id = new String(cn.id);
		hten = new String(cn.hten);
		ngay = new String(cn.hten);
		phai = cn.phai;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap id: ");
		id = sc.nextLine();
		System.out.println("nhap ho va ten: ");
		hten = sc.nextLine();
		System.out.println("nhap ngay, thang, nam sinh(DD-MM-YYYY):");
		ngay = sc.nextLine();
		System.out.println("nhap gioi tinh M(nam), F(nu):  ");
		phai =sc.nextLine().charAt(0);
		
	}
	
	public void in() {
		System.out.print("id: "+id+"\nho va ten: "+hten+"\nngay: "+ngay+"\ngioi tinh: "+phai);
	}
	
	public String toString() {
		return("id: "+id+"\nho va ten: "+hten+"\nngay: "+ngay+"\ngioi tinh: "+phai+"\n");
	}
	
	public static void main(String[] args) {
		CNguoi c1 = new CNguoi();
		c1.nhap();
		c1.in();
		CNguoi c2 = new CNguoi(c1);
		c2.in();
		
		
		
	}
	
}
