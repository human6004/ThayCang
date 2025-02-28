package buoi2;

import java.util.Scanner;

public class Diem {
	private int x, y;

	// ham xay dung mac nhien
	public Diem() { // 1
		x = 0;
		y = 0;
	}

	// ham xay dung co doi so
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// ham sao chep
	public Diem(Diem d) {
		x = d.x;
		y = d.y;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap x:");
		x = sc.nextInt();
		System.out.println("nhap y:");
		y = sc.nextInt();
	}
	
	// ham in khong co doi so
	public void in() {
		System.out.println( "(" + x + "," + y + ")" );
	}
	
	// ham in co doi so
	public void in(String s) {
		System.out.println(s);
		in();
	}
	
	//ghi de phuong thuc toString
	public String toString() {
		return ( "(" + x + "," + y + ")" );
	}
	public void tinhTien(int dx, int dy) {
		x += dx; y+=dy;
	}
	public int layX() {
		return x;
	}
	
	public int layY() {
		return y;
	}
	
	public float Kcach() {
		return (float) Math.sqrt(x*x + y*y);
	}
	
	public float kcach(Diem B) {
		return (float) Math.sqrt( Math.pow ( (x-B.x),2) 
                + Math.pow ( (y-B.y),2));
	}
	
}
