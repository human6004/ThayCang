package Final_CK;

import java.util.Scanner;

public class QuocGia {
	public String masqg;
	public String tenqg;
	public String tenthudo;
	public float GDP;

	public QuocGia() {
		masqg = new String();
		tenqg = new String();
		tenthudo = new String();
		GDP = 0;
	}

	public QuocGia(String masqg, String tenqg, String tenthudo, float gDP) {
		this.masqg = new String(masqg);
		this.tenqg = new String(tenqg);
		this.tenthudo = new String(tenthudo);
		GDP = gDP;
	}

	public QuocGia(QuocGia qg) {
		masqg = new String(qg.masqg);
		tenqg = new String(qg.tenqg);
		tenthudo = new String(qg.tenthudo);
		GDP = qg.GDP;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma so quoc gia: ");
		masqg = sc.nextLine();
		System.out.println("nhap ten quoc gia: ");
		tenqg = sc.nextLine();
		System.out.println("nhap ten thu do: ");
		tenthudo = sc.nextLine();
		System.out.println(" nhap GDP: ");
		GDP = sc.nextFloat();

	}

	public void in() {
		System.out.println("ma so quoc gia: " + masqg);
		System.out.println("ten quoc gia: " + tenqg);
		System.out.println("ten thu do:: " + tenthudo);
		System.out.println("GDP : " + GDP);

	}

	public static void main(String[] args) {
		QuocGia qg = new QuocGia();
		qg.nhap();
		qg.in();
		
		QuocGia qg2 = new QuocGia(qg);
		qg2.in();
	}
}
