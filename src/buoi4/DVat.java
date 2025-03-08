package buoi4;

import java.util.Scanner;

public class DVat {
	private String giong, mau;
	private float cnang;
	
	public DVat() {
		giong = new String();
		mau = new String();
		cnang = 0;
	}
	public DVat(String giong, String mau, float cnang) {

		this.giong = new String(giong);
		this.mau = new String(mau);
		this.cnang = cnang;
	}
	public DVat(DVat dv) {
		giong = new String(dv.giong);
		mau = new String(dv.mau);
		cnang = dv.cnang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap giong:");
		giong = sc.nextLine();
		System.out.println("nhap mau:");
		mau = sc.nextLine();
		System.out.println("nhap can nang:");
		cnang = sc.nextFloat();		
	}
	
	public void in() {
		System.out.println("giong: " + giong + ", mau: " + mau + ", can nang: " + cnang   );
	}
	
	public void keu() {
		
	}

}
