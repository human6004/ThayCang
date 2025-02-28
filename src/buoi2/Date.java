package buoi2;

import java.util.Scanner;

public class Date {
	private int d, m, y;

	public Date() {
		d = 1;
		m = 1;
		y = 1;
	}

	public Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}

	// ham sao chep
	public Date(Date a) {
		d = a.d;
		m = a.m;
		y = a.y;
	}

	public boolean hople() {
		boolean h = false;
		int max[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (y % 4 == 0)
			max[2] = 29;

		if (d > 0 && y > 0 && m < 13 && d < max[m])
			h = true;
		return h;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(" Nhap ngay:");
			d = sc.nextInt();
			System.out.println(" Nhap thang:");
			m = sc.nextInt();
			System.out.println(" Nhap nam:");
			y = sc.nextInt();
			if (!hople())
				System.out.println("ngay khong hop le!\n vui long nhap lai");
		} while (!hople());
	}

	public void in() {
		System.out.println(d + "/" + m + "/" + y);
	}

	public String toString() {
		return (d + "/" + m + "/" + y);
	}

	public Date cong() {
		Date k = new Date(d,m,y);
		k.d ++;
		if(!k.hople()) {
			k.d = 1;
			k.m ++;
			if(!k.hople()) {
				k.m = 1;
				k.y ++;
			}
		}
		return k;
	}

	public Date cong(int n) {
		Date k = new Date(d,m,y);
		for(int i = 0; i < n; i++) {
			k = k.cong();
		}
		return k;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
