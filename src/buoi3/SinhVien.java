package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {
	private String msv, hten;
	private Date nsinh;
	private int n, max;// n la so luong
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
		this.nsinh = new Date(nsinh);
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

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mssv: ");
		msv = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hten = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		nsinh.nhap();
		System.out.println("Nhap so luong mon hoc: ");
		n = sc.nextInt();
		if (n > max)
			n = max;
		sc.nextLine(); // loai bo phim enter
		for (int i = 0; i < n; i++) {
			System.out.println("\n Nhap mon thu " + (i + 1) + ":");
			mon[i] = sc.nextLine();
			System.out.println("\n Nhap diem mon thu " + (i + 1) + ":");
			diem[i] = sc.nextLine();
		}
	}

	public void in() {
		System.out.println("[" + msv + ", " + hten + ", " + nsinh + ", + cac mon hoc: ");
		// in cac mon hoc
		for (int i = 0; i < n; i++) {
			System.out.print(mon[i] + ":" + diem[i] + ", ");
			System.out.print("]");
		}
	}

	public String toString() {
		String s = ("[" + msv + ", " + hten + ", " + nsinh + ", + cac mon hoc: ");
		// in diem mon hoc
		for (int i = 0; i < n; i++)
			s += (mon[i] + ":" + diem[i] + ",");
		s += ("]");

		return s;
	}

	public float dtb() {
		float d = 0.0f;
		for (int i = 0; i < n; i++) {
			if (diem[i].equals("A"))
				d += 4;
			else if (diem[i].equals("B+"))
				d += 3.5;
			else if (diem[i].equals("B"))
				d += 3;
			else if (diem[i].equals("C+"))
				d += 2.5;
			else if (diem[i].equals("C"))
				d += 2;
			else if (diem[i].equals("D"))
				d += 1.5;
			else if (diem[i].equals("B+"))
				d += 1;
		}
		return (d / n);
	}

	public void them(String m, String d) {
		if (n < max) { // them mon vao cuoi dsach
			mon[n] = new String(m);
			diem[n] = new String(d);
			n++;
		}
	}

	public void xoa(String m) {
		int i = 0;
		for (i = 0; i < n; i++) { // tim kiem mon hoc m
			if (mon[i].equals(m))
				break;
		}

		if (i < n) { // tim thay mon m
			for (int j = i; j < n - 1; j++) {
				mon[j] = new String(mon[j + 1]);
				diem[j] = new String(diem[j + 1]);
			}
			n--;
		}
	}

	public String layTen() {
		hten = hten.trim();
		return hten.substring(hten.lastIndexOf(" ") + 1);
	}

	public String layEmail() {
		return "";
	}

	public String layTKhoan() {
		return "";
	}

}
