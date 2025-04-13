package KTCK;

import java.util.Scanner;

public class GDichTTe extends GDich{
	private float dgia;
	private int sluong;
	private char loai;
	private float tgia;
	
	public GDichTTe() {
		super();
		dgia = 0.0f;
		sluong = 0;
		loai = ' ';
		tgia = 0.0f;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap don gia: ");
		dgia = sc.nextFloat();
		System.out.println("nhap so luong: ");
		sluong = sc.nextInt();
		sc.nextLine();
		System.out.println("nhap loai tien te: ");
		loai = sc.nextLine().charAt(0);
		System.out.println("nhap ti gia: ");
		tgia = sc.nextFloat();
	}
	
	public void in() {
		super.in();
		System.out.println("don gia: "+dgia+"\nso luong: "+sluong+ "\nloai tien te: "+loai+"\nti gia: "+tgia+"\n");
	}
	
	public char getLoai() {
		return loai;
	}
	
	public float thanhTien() {
		return (float)sluong*dgia*tgia;
	}
	
	public static void main(String[] args) {
//		GDichTTe gd1 = new  GDichTTe();
//		gd1.nhap();
//		gd1.in();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so luong mang: ");
		int n = sc.nextInt();
		GDichTTe ds[] = new GDichTTe[n];
		for(int i=0; i<n;i++) {
			ds[i] = new GDichTTe();
			System.out.println("gd thứ " + (i+1)+":");
			ds[i].nhap();			
		}
		
		for(int i=0; i<n;i++) {
			System.out.println("gd thứ " + (i+1)+": \n");
			ds[i].in();			
		}
//		for(GDichTTe gd : ds) {
//			gd.in();
//			
//		}
		
		System.out.println("\ncac ma giao dich tren 1000000: ");
		int check = 0;
		for(GDichTTe gd : ds) {
			if(gd.getLoai() == 'V' && gd.thanhTien() >1000000) {
			System.out.println(gd.getMgd());
			check++;
			}
			
		}
		if(check==0) {
			System.out.println("ko có giao dịch nào trên 1000000");
		}
	}

}
