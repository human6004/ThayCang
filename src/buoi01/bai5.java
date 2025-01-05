package buoi01;

import java.util.Scanner;

public class bai5 {
	/*
	 * Bài 5 : Viết chương trình giải phương trình bậc 2 trong đó gồm 2 hàm static
	 * giải phương trình bậc 1 (2 tham số) và giải phương trình bậc 2 (3 tham số).
	 */
	public static void giaiPhuongTrinhBac1(double a, double b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình bậc 1 có vô số nghiệm.");
			} else {
				System.out.println("Phương trình bậc 1 vô nghiệm.");
			}
		} else {
			double x = -b / a;
			System.out.println("Phương trình bậc 1 có nghiệm: x = " + x);
		}
	}

	public static void giaiPhuongTrinhBac2(double a, double b, double c) {
		if (a == 0) {
			// Nếu a = 0, phương trình trở thành bậc 1: bx + c = 0
			System.out.println("Phương trình trở thành bậc 1:");
			giaiPhuongTrinhBac1(b, c);
		} else {
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình bậc 2 vô nghiệm.");
			} else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.println("Phương trình bậc 2 có nghiệm kép: x = " + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình bậc 2 có hai nghiệm phân biệt:");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}

	// Hàm main để chạy chương trình
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		bai5 b2 = new bai5();
		System.out.println("Giải phương trình bậc 2: ax^2 + bx + c = 0");
		System.out.print("Nhập a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập c: ");
		double c = scanner.nextDouble();
		b2.giaiPhuongTrinhBac2(a, b, c);
//		giaiPhuongTrinhBac2(a, b, c);

		scanner.close();
	}
}
