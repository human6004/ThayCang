package buoi3;

import buoi2.Diem;

public class SDDoanThang {
	 public static void main(String[] args) {
		Diem a = new Diem(2,5);
		Diem b = new Diem(20,35);
		DoanThang ab = new DoanThang(a,b);
		System.out.println("doan thang ab:" + ab);
		
		ab.tinTien(6, 8);
		System.out.println("tientinh ab:" + ab);
		
		DoanThang cd = new DoanThang();
		cd.nhap();
		cd.in();
		System.out.println("do dai cd:" + cd.doDai());
	}
}
