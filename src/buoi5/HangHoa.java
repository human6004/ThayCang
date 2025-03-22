package buoi5;

import java.util.Scanner;

public class HangHoa {
    private String mso;
    private String ten;
    private String nsxuat;
    
    
    
    public HangHoa() {
    	mso = new String();
    	ten = new String();
    	nsxuat = new String();
	}

	public HangHoa(String mso, String ten, String nsxuat) {
		this.mso = new String(mso);
		this.ten = new String(ten);
		this.nsxuat = new String(nsxuat);
	}
	

	public HangHoa(HangHoa hh) {
		mso = new String(hh.mso);
		ten = new String(hh.ten);
		nsxuat = new String(hh.nsxuat);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma so:");
		mso = sc.nextLine();
		System.out.println("nhap ten: ");
		ten = sc.nextLine();
		System.out.println(" nhap ngay san xuat: ");
		nsxuat = sc.nextLine();
		
    }

    public void in() {
        System.out.println("ma so: "+ mso + "\nten" + ten + "\nngay san xuat: " + nsxuat);
    }
    
    public String toString() {
    	return ("ma so: "+ mso + "\nten" + ten + "\nngay san xuat: " + nsxuat);
    }
    
}
