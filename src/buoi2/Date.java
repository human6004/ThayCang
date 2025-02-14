package buoi2;

public class Date {
	private int ngay, thang, nam;

	// Hàm xây dựng mặc nhiên
	public Date() {
		this.ngay = 1;
		this.thang = 1;
		this.nam = 2000;
	}

	// Hàm xây dựng có 3 tham số
	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	// Kiểm tra ngày hợp lệ
	public boolean hopLe() {
		java.time.LocalDate date;
		try {
			date = java.time.LocalDate.of(nam, thang, ngay);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	// Nhập ngày từ bàn phím
	public void nhapDate() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		do {
			System.out.print("Nhập ngày: ");
			ngay = scanner.nextInt();
			System.out.print("Nhập tháng: ");
			thang = scanner.nextInt();
			System.out.print("Nhập năm: ");
			nam = scanner.nextInt();
		} while (!hopLe());
	}

	// Hiển thị ngày
	public void hienThi() {
		System.out.printf("%02d/%02d/%04d\n", ngay, thang, nam);
	}

	// Tính ngày hôm sau
	public Date ngayHomSau() {
		java.time.LocalDate date = java.time.LocalDate.of(nam, thang, ngay).plusDays(1);
		return new Date(date.getDayOfMonth(), date.getMonthValue(), date.getYear());
	}

	// Cộng thêm n ngày
	public Date congNgay(int n) {
		java.time.LocalDate date = java.time.LocalDate.of(nam, thang, ngay).plusDays(n);
		return new Date(date.getDayOfMonth(), date.getMonthValue(), date.getYear());
	}
}
