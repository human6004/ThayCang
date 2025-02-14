package buoi2;

public class PhanSo {
	   private int tu, mau;

	    // Hàm xây dựng mặc nhiên
	    public PhanSo() {
	        this.tu = 0;
	        this.mau = 1;
	    }

	    // Hàm xây dựng có tham số
	    public PhanSo(int tu, int mau) {
	        if (mau == 0) throw new IllegalArgumentException("Mẫu số không thể bằng 0");
	        this.tu = tu;
	        this.mau = mau;
	    }

	    // Nhập phân số
	    public void nhapPhanSo() {
	        java.util.Scanner scanner = new java.util.Scanner(System.in);
	        do {
	            System.out.print("Nhập tử số: "); tu = scanner.nextInt();
	            System.out.print("Nhập mẫu số: "); mau = scanner.nextInt();
	        } while (mau == 0);
	    }

	    // Hiển thị phân số
	    public void hienThi() {
	        if (tu == 0) {
	            System.out.println("0");
	        } else if (mau == 1) {
	            System.out.println(tu);
	        } else {
	            System.out.printf("%d/%d\n", tu, mau);
	        }
	    }

	    // Nghịch đảo phân số
	    public void nghichDao() {
	        if (tu == 0) throw new ArithmeticException("Không thể nghịch đảo phân số có tử số bằng 0");
	        int temp = tu;
	        tu = mau;
	        mau = temp;
	    }

	    // Lấy phân số nghịch đảo
	    public PhanSo giaTriNghichDao() {
	        if (tu == 0) throw new ArithmeticException("Không thể nghịch đảo phân số có tử số bằng 0");
	        return new PhanSo(mau, tu);
	    }

	    // Giá trị thực của phân số
	    public double giaTriThuc() {
	        return (double) tu / mau;
	    }
}
