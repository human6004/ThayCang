package buoi5;

import java.util.Scanner;

public class ChiTiet {
    private int sluong;
    private double dgia;
    private HangHoa hoangHoa;
    
    
    
    public int getSluong() {
		return sluong;
	}

	public void setSluong(int sluong) {
		this.sluong = sluong;
	}

	public double getDgia() {
		return dgia;
	}

	public void setDgia(double dgia) {
		this.dgia = dgia;
	}

	public HangHoa getHoangHoa() {
		return hoangHoa;
	}

	public void setHoangHoa(HangHoa hoangHoa) {
		this.hoangHoa = hoangHoa;
	}

	public ChiTiet() {
		sluong = 0;
		dgia = 0.0;
		hoangHoa = new HangHoa();
	}

	public ChiTiet(int sluong, double dgia, HangHoa hoangHoa) {
		this.sluong = sluong;
		this.dgia = dgia;
		this.hoangHoa = new HangHoa();
		
	}
	

	public ChiTiet( ChiTiet chiTiet) {
		sluong = chiTiet.sluong;
		dgia = chiTiet.dgia;
		hoangHoa = new HangHoa(chiTiet.hoangHoa);
		
	}

	public void nhap() {
		hoangHoa.nhap();
		Scanner  sc = new Scanner(System.in);
		System.out.println("nhap so luong: ");
		sluong = sc.nextInt();
		System.out.println("nhap don gia: ");
		dgia = sc.nextDouble();
        
    }

    public void in() {
    	hoangHoa.in();
    	System.out.println("so luong: " + sluong + "\ndon gia: " + dgia);
    }
    
    public String toString() {
    	return hoangHoa.toString() + ("so luong: " + sluong + "\ndon gia: " + dgia);
    }
}
