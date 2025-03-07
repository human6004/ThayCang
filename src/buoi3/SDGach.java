package buoi3;

import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Gach g = new Gach();
		System.out.println("nhap thong tin gach:");
		g.nhap();
		System.out.println(" thong tin gach");
		g.in();

		System.out.println("Nhap so luong gach:");
		int n = sc.nextInt();
		Gach[] arr = new Gach[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Gach();
			System.out.println("thong tin gach so " + (i + 1) + " : ");
			arr[i].nhap();
		}

		for (Gach g1 : arr)
			System.out.println(arr);

	}
}
