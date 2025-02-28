package buoi2;

import java.util.Scanner;

public class SDCanBo {
	public static void main(String[] args) {
		canBo a = new canBo();
		a.nhap();
		a.in();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so can bo trong danh sach: ");
		int n = sc.nextInt();
		n = (n<=100)?n:100;
		canBo[] arr = new canBo[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new canBo();
			System.out.println("nhap thong tin can bo thu " + (i+1) +": ");
			arr[i].nhap();
		}
		
		for(int i = 0; i < n; i++) {
			arr[i].in();
		}
	}

}
