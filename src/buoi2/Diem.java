package buoi2;

public class Diem {
	private int x, y;

	// Hàm xây dựng mặc nhiên
	public Diem() {
		this.x = 0;
		this.y = 0;
	}

	// Hàm xây dựng có 2 tham số
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Nhập tọa độ từ bàn phím
	public void nhapDiem() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Nhập hoành độ x: ");
		this.x = scanner.nextInt();
		System.out.print("Nhập tung độ y: ");
		this.y = scanner.nextInt();
	}

	// Hiển thị tọa độ
	public void hienThi() {
		System.out.println("(" + x + ", " + y + ")");
	}

	// Dời điểm
	public void doiDiem(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	// Lấy hoành độ
	public int giaTriX() {
		return x;
	}

	// Lấy tung độ
	public int giaiTriY() {
		return y;
	}

	// Tính khoảng cách đến gốc tọa độ
	public float khoangCach() {
		return (float) Math.sqrt(x * x + y * y);
	}

	// Tính khoảng cách đến điểm khác
	public float khoangCach(Diem d) {
		return (float) Math.sqrt(Math.pow(this.x - d.x, 2) + Math.pow(this.y - d.y, 2));
	}
}


