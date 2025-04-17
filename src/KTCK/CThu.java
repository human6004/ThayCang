package KTCK;

import java.awt.image.BandCombineOp;
import java.util.Scanner;

public class CThu extends CNguoi {
	private int so;
	private String vitri;
	private long bthang;
	private String mua, clbo;

	public CThu() {
		super();
		so = 0;
		vitri = new String();
		bthang = 0;
		mua = new String();
		clbo = new String();
	}

	public CThu(CThu ct) {
		super(ct);
		so = ct.so;
		vitri = new String(ct.vitri);
		bthang = ct.bthang;
		mua = new String(ct.mua);
		clbo = new String(ct.clbo);
	}

	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so ao: ");
		so = sc.nextInt();
		sc.nextLine();
		System.out.println("nhap vi tri TM(thủ môn), HV(hậu vệ), TV(trung vệ), TVE(tiền vệ), TD(tiền đạo): ");
		vitri = sc.nextLine();
		System.out.println("nhap so ban thang: ");
		bthang = sc.nextLong();
		sc.nextLine();
		System.out.println("nhap mua thi dau cua cau thu: ");
		mua = sc.nextLine();
		System.out.println("nhap clb cua cau thu: ");
		clbo = sc.nextLine();
	}

	public void in() {
		super.in();
		System.out.println("\nso ao cau thu: " + so);
		System.out.println("\nvi tri: " + vitri);
		System.out.println("\nso ban thang: " + bthang);
		System.out.println("\nmua giai: " + mua);
		System.out.println("\ncau lac bo: " + clbo);
		System.out.println("\n");

	}

	public String getVitri() {
		return vitri;
	}
	
	public long getBthang() {
		return bthang;
	}

	public long tinhLuong() {
		long luongCoBan = 7000000;
		if(getVitri().equals("TM")){
				luongCoBan+=300000;
		}
		else if(getVitri().equals("TV")) {
			luongCoBan+=450000;
		}
		else if(getVitri().equals("TVE")) {
			luongCoBan+=500000;
		}
		else if(getVitri().equals("HV")) {
			luongCoBan+=400000;
		}
		else if(getVitri().equals("TD")) {
			luongCoBan+=500000;
		}
		
		luongCoBan += getBthang()*500000;
		luongCoBan = luongCoBan / 100 * 90;

		return luongCoBan;
	}

	public static void main(String[] args) {
//		CThu ct = new CThu();
//		ct.nhap();
//		ct.in();
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------------------\nnhập số lượng phần tử mảng: ");
		int n = sc.nextInt();
		CThu ds[] = new CThu[n];
		for (int i = 0; i < n; i++) {
			ds[i] = new CThu();
		}
		System.out.println("nhâp thông tin các cầu thủ:\n ");
		for (int i = 0; i < n; i++) {
			System.out.println("cầu thủ thứ " + (i + 1) + ": ");
			ds[i].nhap();
		}
		System.out.println("---------------------------------------------------\\thông tin của các cầu thủ: ");
		for (int i = 0; i < n; i++) {
			System.out.println("thông tin cầu thủ thứ " + (i + 1) + ": ");
			ds[i].in();
			System.out.println("Lương cầu thủ: " + ds[i].tinhLuong() + " VND");
		}

	}

}
