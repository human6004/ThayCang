package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SDSinhVienCNTT {
	public static void main(String[] args) {
//		SinhVienCNTT sv = new SinhVienCNTT();
//		sv.nhap();
//		sv.in();

		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap so luong singh vien: ");
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		int c = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("ban nhap sinh vien (0) hay la sinh vien cntt (1) ");
			c = sc.nextInt();
			if (c == 0)
				ds[i] = new SinhVien();
			else
				ds[i] = new SinhVienCNTT();
			ds[i].nhap();
		}
		
		for(SinhVien s1 : ds) {
			s1.in();
		}
		
		System.out.println("\n Nhap email can tim:");
		String email = sc.nextLine();
		System.out.println("\n Sinh Vien co email can tim: ");
		for(int i=0;i<n;i++) {
			if(ds[i].layEmail().equals(email))
				System.out.println("\n Tai khoan:" + ds[i].layTKhoan()
						              + ", ket qua htap: " + ds[i].dtb());
		}
		
		SinhVien t;
		 for(int i = 0; i < n-1; i++)
			 for(int j = 0; j < n; j++) {
					if (ds[i].layTen().compareTo(ds[j].layTen()) >0) {

					} 
			 }
			 

				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
	}
}
