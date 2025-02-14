package buoi2;

public class SDDate {
	public static void main(String[] args) {
		Date d = new Date();
		d.nhapDate();
		System.out.print("Ngày vừa nhập: ");
		d.hienThi();

		Date ngaySau = d.ngayHomSau();
		System.out.print("Ngày hôm sau: ");
		ngaySau.hienThi();

		Date cong20Ngay = d.congNgay(20);
		System.out.print("Sau 20 ngày: ");
		cong20Ngay.hienThi();
	}
}
