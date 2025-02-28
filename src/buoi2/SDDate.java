package buoi2;

public class SDDate {
	public static void main(String[] args) {
		Date a = new Date(28, 2, 2025);
		a.in();
		Date b = new Date();
		b.nhap();
		b.in();
		
		System.out.println("cong them 10 ngay:");
		b = b.cong(10);
		b.in();
	}
	
}
