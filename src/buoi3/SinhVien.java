package buoi3;

import buoi2.Date;

public class SinhVien {
	private String msv, hten;
	private Date nsinh;
	private int n, max;
	private String mon[], diem[];

	public SinhVien() {
		msv = new String();
		hten = new String();
		nsinh = new Date();
		max = 50;
		n = 0;
		mon = new String[max];
		diem = new String[max];
	}

	public SinhVien(String msv, String hten, Date nsinh, int n, int max, String[] mon, String[] diem) {
		this.msv = new String(msv);
		this.hten = new String(hten);
		this.nsinh = new Date(nsinh) ;
		this.n = n;
		this.max = max;
		this.mon = new String[max];
		this.diem = diem;
	}

	public SinhVien(SinhVien s) {
		msv = new String(s.msv);
		hten = new String(s.hten);
		nsinh = new Date(s.nsinh);
		max = s.max;
		n = s.n; // so mon da hoc
		mon = new String[s.max];
		diem = new String[s.max];
		for (int i = 0; i < n; i++) { // sao chep cac mon mon da dang ky
			mon[i] = new String(s.mon[i]);
			diem[i] = new String(s.diem[i]);
		}
	}
}
