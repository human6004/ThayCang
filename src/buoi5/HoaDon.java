package buoi5;

import java.util.Scanner;

import buoi2.Date;

public class HoaDon {
	private String mso;
	private String tde;
	private String nvien;
	private KhachHang khachHang;
	private Date date;
	private ChiTiet chiTiet[];

	public HoaDon() {
		mso = new String();
		tde = new String();
		nvien = new String();
		khachHang = new KhachHang();
		date = new Date();
		chiTiet = new ChiTiet[100];
	}

	public HoaDon(String mso, String tde, String nvien, KhachHang khachHang, Date date, ChiTiet[] chiTiet) {
		this.mso = new String(mso);
		this.tde = new String(tde);
		this.nvien = new String(nvien);
		this.khachHang = new KhachHang(khachHang);
		this.date = new Date(date);
		for (int i = 0; i < chiTiet.length; i++) {
			this.chiTiet[i] = new ChiTiet(chiTiet[i]);
		}
	}

	public HoaDon(HoaDon hd) {
		mso = new String(hd.mso);
		tde = new String(hd.tde);
		nvien = new String(hd.nvien);
		khachHang = new KhachHang(hd.khachHang);
		date = new Date(hd.date);
		for (int i = 0; i < chiTiet.length; i++) {
			chiTiet[i] = new ChiTiet(hd.chiTiet[i]);
		}

	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ma so hoa don:");
		mso = sc.nextLine();
		System.out.print("Nhap vao tieu de cua hoa don: ");
		tde = sc.nextLine();
		System.out.print("Ai la nguoi tao hoa don: ");
		nvien = sc.nextLine();
		System.out.print("Day co phai la khach hang vip? 1 Co !1 Khong: ");
		int temp = sc.nextInt();
		if (temp == 1) {
			khachHang = new KhachHangVIP();
		} else {
			khachHang = new KhachHang();
		}
		khachHang.nhap();
		System.out.print("Nhap vao so don hang cua hoa don: ");
		chiTiet = new ChiTiet[sc.nextInt()];
		for (int i = 0; i < chiTiet.length; i++) {
			chiTiet[i] = new ChiTiet();
			System.out.println("Nhap thong tin hang thu " + (i + 1) + " :");
			chiTiet[i].nhap();
		}
	}

	public void in() {
		String result =new String("");
		result+="Ma so: "+mso;
		result+="\nTieu de: "+tde;
		result+="\nTen nhan vien: "+nvien;
		result+="\nTen khach hang: "+khachHang.getHten();
		result+="\nThong tin chi tiet hoa don:";
		for(int i =0 ; i<chiTiet.length;i++) {
			result+="Hang thu "+(i+1)+" :"+chiTiet[i]+"\n";
		}
		result+="Gia tri hoa don: "+tong()+"\n";
		result+="Thanh tien : "+tongDiscount()+"\n";
		System.out.print(result);

	}

	public float tong() {
		float result =0f;
		for (int i = 0 ; i< chiTiet.length;i++) {
			result += chiTiet[i].getSluong()* chiTiet[i].getDgia();
			}
		return result;
	}
	
	public double tongDiscount() {
	    double result = 0.0;  
	    for (int i = 0; i < chiTiet.length; i++) {
	        double discountAmount = chiTiet[i].getSluong() * chiTiet[i].getDgia() * (100 - khachHang.getDiscount()) / 100.0;
	        result += discountAmount;
	    }
	    return result;
	}


}
