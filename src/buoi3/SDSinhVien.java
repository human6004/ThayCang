package buoi3;

import java.util.Scanner;

public class SDSinhVien {

	public static void main(String[] args) {
		SinhVien s = new SinhVien();
		s.nhap();
		s.in();

		// nhap danh sach sinh vien
		SinhVien ds[];
		Scanner sc = new Scanner(System.in);

		System.out.println("\n Nhap so sinh vien: ");
		int n = sc.nextInt();

		ds = new SinhVien[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\n Nhap sinh vien thu " + (i + 1) + ": ");
			ds[i] = new SinhVien();
			ds[i].nhap();
		}

		System.out.println("\n Danh sach sinh vien vua nhap:");
		for (int i = 0; i < n; i++)
			System.out.println(ds[i]);

		System.out.println("\n Danh sach sinh vien bi canh bao:");
		for (int i = 0; i < n; i++)
			if (ds[i].dtb() < 1)
				System.out.println(ds[i]);

		System.out.println("\n Danh sach sinh vien co diem cao nhat:");
		float max = Float.MIN_VALUE;
		for (int i = 0; i < n; i++)
			if (max < ds[i].dtb())
				max = ds[i].dtb();

		for (int i = 0; i < n; i++)
			if (ds[i].dtb() == max)
				System.out.println(ds[i]);

		// sap sep sinh vien theo ten:
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (ds[i].layTen().compareTo(ds[j].layTen()) < 0) {
					SinhVien t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
		System.out.println("\n Danh sach sinh vien da sap theo ten:");
		for (int i = 0; i < n; i++)
			System.out.println(ds[i]);

	}

}
