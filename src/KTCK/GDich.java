package KTCK;

import java.util.Scanner;

public class GDich {
	private int mgd;
	private String hten, ngay;
	private boolean tthai;
	
	
	public GDich() {
		mgd = 0;
		hten = new String("");
		ngay = new String("");
		tthai = false;
		
	}
	
	public GDich(int mgd, String hten, String ngay, boolean tthai) {
		this.mgd = mgd;
		this.hten = hten;
		this.ngay = ngay;
		this.tthai = tthai;
	}

	public GDich(GDich gd) {
		mgd = gd.mgd;
		hten = new String(gd.hten);
		ngay = new String(gd.ngay);
		tthai = gd.tthai;
		
	}
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma giao dich: ");
		mgd = sc.nextInt();
		sc.nextLine();
		System.out.println("nhap ho ten: ");
		hten = sc.nextLine();
		System.out.println("nhap ngay (DD-MM-YYYY): ");
		ngay = sc.nextLine();
		System.out.println("nhap trang thai (true or false): ");
		tthai = sc.nextBoolean();
		
	}
	
	public void in () {
		System.out.print("ma giao dich: "+mgd+"\nho ten: "+hten+"\nngay: "+ngay+"\ntrang thai giao giao dich: "+ tthai+"\n");
	}
	
	public String toString() {
		return ("ma giao dich: "+mgd+"\nho ten: "+hten+"\nngay: "+ngay+"\ntrang thai giao giao dich: "+ tthai+"\n");
	}
	
	public int getMgd() {
		return mgd;
	}
	
	public static void main(String[] args) {
		GDich gd1 = new GDich();
		gd1.nhap();
		gd1.in();
		System.out.println("hàm sao chép: \n");
		GDich gd2 = new GDich(gd1);
		gd2.in();
	}
	
	
	
	
}
