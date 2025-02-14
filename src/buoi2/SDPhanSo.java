package buoi2;

public class SDPhanSo {
	public static void main(String[] args) {
		PhanSo a = new PhanSo(3, 7);
		PhanSo b = new PhanSo(4, 9);
		System.out.print("Phân số a: ");
		a.hienThi();
		System.out.print("Phân số b: ");
		b.hienThi();

		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		x.nhapPhanSo();
		y.nhapPhanSo();

		System.out.print("Nghịch đảo của x: ");
		x.giaTriNghichDao().hienThi();
	}
}
