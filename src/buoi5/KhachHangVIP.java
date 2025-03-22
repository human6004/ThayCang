package buoi5;

import java.util.Scanner;

import buoi2.Date;

public class KhachHangVIP extends KhachHang {
    private float tLeGiam;
    private Date date;
    
    
    
    public float getDiscount() {
		return tLeGiam;
	}

	public void settLeGiam(float tLeGiam) {
		this.tLeGiam = tLeGiam;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public KhachHangVIP() {
		super();
		tLeGiam = 0;
		date = new Date();
	}

	public KhachHangVIP(KhachHangVIP kh) {
		super();
		tLeGiam = kh.tLeGiam;
		date = new Date(kh.date);
		
	}

	

	public KhachHangVIP(float tLeGiam, Date date) {
		super();
		this.tLeGiam = tLeGiam;
		this.date = new Date(date);
	}

	
    public void nhap() {
    	super.nhap();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("nhap vocher giam: ");
    	tLeGiam = sc.nextFloat();
    	System.out.println("nhap han su dung: ");
    	date.nhap();
    }

   
    public void in() {
    	super.in();
    	System.out.println("ti le giam: " + tLeGiam + "\nhan su dung vocher: " + date );

    }
    public String toString() {
    	return super.toString() + ("ti le giam: " + tLeGiam + "\nhan su dung vocher: " + date );
    }

}
