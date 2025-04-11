package KTCK;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("nhap so luong phan tu trong mang");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); // bỏ qua dấu xuống hàng
		String a[] = new String[n]; //  cáp phát bộ nhớ cho mảng

		for (int i = 0; i < n; i++) {
			a[i] = new String(); // cấp phát bộ nhớ cho từng phần tử của mảng
			a[i] = sc.nextLine(); // nhập dữ liệu ch từng phần tử của mảng


		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
			System.out.print(", ");

		}
		System.out.println();
	}

}
