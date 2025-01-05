package buoi01;

import java.util.Scanner;

public class bai4 {
	/*
	 * Viết chương trình nhập vào 2 số nguyên a và b. Tính tổng và hiển thị ra màn
	 * hình. Nếu số nhập vào không đúng định dạng thì hiển thị thông báo lỗi, yêu
	 * cầu nhập lại.
	 */
	public int nhap() {
		Scanner sc = new Scanner(System.in);
		String s;
		int n;
		do {
			System.out.println("\nNhap 1 so nguyen: ");
			s = sc.nextLine();
			try {
				n = Integer.parseInt(s);
			}catch(NumberFormatException e) {
				n = Integer.MAX_VALUE;
				System.out.println("\n ban nhap sai gia tri, vui long nhap lai!");
			}
		}while(n == Integer.MAX_VALUE);
		return n;
		
	}
	public static void main(String[] args) {
		bai4 t = new bai4();
		int a = t.nhap();
		int b = t.nhap();
		System.out.println("tong = " +(a+b));
		
	}
}
