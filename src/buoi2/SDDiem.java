package buoi2;

public class SDDiem {
	public static void main(String[] args) {
		// Tạo điểm A
		Diem A = new Diem(3, 4);
		System.out.print("Tọa độ điểm A: ");
		A.hienThi();

		// Tạo điểm B từ bàn phím
		Diem B = new Diem();
		B.nhapDiem();
		System.out.print("Tọa độ điểm B: ");
		B.hienThi();

		// Tạo điểm C đối xứng với B qua gốc tọa độ
		Diem C = new Diem(-B.giaTriX(), -B.giaiTriY());
		System.out.print("Tọa độ điểm C (đối xứng với B): ");
		C.hienThi();

		// Khoảng cách từ B đến tâm O
		System.out.println("Khoảng cách từ B đến O: " + B.khoangCach());

		// Khoảng cách từ A đến B
		System.out.println("Khoảng cách từ A đến B: " + A.khoangCach(B));
	}
}
