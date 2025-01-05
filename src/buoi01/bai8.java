package buoi01;

import java.util.Iterator;
import java.util.Scanner;

public class bai8 {
	/*
	 * Bài 8 : Viết chương trình thực hiện các công việc sau:  Nhập vào 1 danh sách
	 * các số nguyên.  Nhập vào 1 số nguyên x bất kỳ. Đếm xem trong danh sách có
	 * bao nhiêu số x.  Sắp xếp danh sách theo thứ tự tăng dần.  Hiển thị danh
	 * sách ra màn hình.
	 */
	int ds[];
	int n;

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu: ");
		n = sc.nextInt();
		ds = new int[n];
		for (int i = 0; i < ds.length; i++) {
			System.out.println(" Nhap phan tu thu " + (i + 1));
			ds[i] = sc.nextInt();
		}
	}

	public void in() {
		for (int e : ds) {
			System.out.print(e + " ");
		}
		System.out.println("\n");
	}

	public void sapXep() {
		for (int i = 0; i < ds.length - 1; i++) {
			for (int j = i + 1; j < ds.length; j++) {
				if (ds[i] > ds[j]) {
					int t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
			}
		}
	}

	public int dem(int x) {
		int c = 0;
		for (int e : ds) {
			if (e == x)
				c++;
		}
		return c;
	}
	
	public static void main(String[] args) {
		bai8 bai8 = new bai8();
		bai8.nhap();
		bai8.in();
		bai8.sapXep();
		bai8.in();
	}
}
