package KTCK;

import java.util.Scanner;

public class GDich {
	private int mgd;
	private String hten, ngay;
	private boolean tthai;
	
	
	public GDich() {
		mgd = 0;
		hten = new String();
		ngay = new String();
		tthai = true;
		
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
		System.out.println("nhap ngay: ");
		ngay = sc.nextLine();
		System.out.println("nhap trang thai ");
		tthai = sc.nextBoolean();
		
	}
	
	public void in () {
		System.out.println("ma giao dich: "+mgd+"\nho ten: "+hten+"ngay: "+ngay+"\ntrang thai giao giao dich: "+ tthai+"\n");
	}
	
	public int getMgd() {
		return mgd;
	}
	
	public static void main(String[] args) {
		GDich gd1 = new GDich();
		gd1.nhap();
		gd1.in();
		
		GDich gd2 = new GDich(gd1);
		gd2.in();
	}
	
	
	
	
}
