package buoi3;

import buoi2.Diem;

public class DoanThang {
	private Diem d1, d2;
	
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	
	public DoanThang(Diem d1, Diem d2) {
		this.d1 = new Diem(d1);
		this.d2 = new Diem(d2);
	}
	
	public DoanThang(DoanThang dt) {// đây là sao chép sâu 
		d1 = new Diem(dt.d1);
		d2 = new Diem(dt.d2);
	}
	
	public void in() {
		System.out.println("(" + d1 + ";" + d2 + ")" );
	}
	
	public String toString() {
		return ("(" + d1 + ";" + d2 + ")" );
	}
	
	public void nhap() {
		System.out.println("nhap diem d1");
		d1.nhap();
		System.out.println("nhap diem d2");
		d2.nhap();
	}
	public void tinTien(int dx, int dy) {
		d1.tinhTien(dx, dy);
		d2.tinhTien(dx, dy);
	}
	
	public float doDai() {
		return d1.kcach(d2);
	}
}
