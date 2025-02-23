package buoi2;

public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		System.out.println("toa do diem A: ");
		A.in();
		
		Diem B = new Diem();
		System.out.println("nhap tao do diem B: ");
		B.nhap();
		System.out.println("toa do diem B: ");
		B.in();
		
		Diem C = new Diem(-B.layX(), -B.layY());
		System.out.print("Toa do diem doi xung C:");
		C.in();
		
		System.out.println("khoang cach OB= "+ B.Kcach());
		System.out.println("khoang cach AB= "+ B.kcach(A));
		
		//su dung xay dung sao chep
		Diem D = new Diem(C);
		System.out.println("Toa do D:");
		D.in();
		
		//su dung ham in co doi so
		D.in("toa do diem D");
		
		// su dung ham toString tai dinh nghia
		System.out.println("toa do diem D:" + D);
		
		// sao chep dia chi tham chieu
		//nghia la gia C bang bao nhieu thi E bang bay nhieu
		Diem E = C;
		System.out.println("toa do E:" + E);
	}
}
