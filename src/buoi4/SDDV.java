package buoi4;



import java.util.Scanner;

import buoi4.DVat;

public class SDDV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so dong vat trong trang trai: ");
		int n = sc.nextInt();
		DVat[] arr = new DVat[n];
		int c;
		for(int i = 0 ; i<  n; i ++) {
			System.out.print("Ban muon nhap vao heo (0) hay bo(1) hay ga (2): ");
			c = sc.nextInt();
			if(c==0) {
				arr[i] = new Heo();
			}else if(c==1){
				arr[i] = new Bo();
			}else {
				arr[i] = new Ga();
			}
			arr[i].nhap();
		}
		
		for(int i = 0 ;i<n;i++) {
			arr[i].in();
			arr[i].keu();
		}
		
		
		
		
		
	}

}
