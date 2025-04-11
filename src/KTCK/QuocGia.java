package KTCK;

import java.util.Scanner;

public class QuocGia {
	private String msqg, tenqg, tenthudo;
	private float GDP;

	public QuocGia() {
		msqg = new String();
		tenqg = new String();
		tenthudo = new String();
		GDP = 0.0f;
	}

	public QuocGia(String msqg, String tenqg, String tenthudo, float GDP) {

		this.msqg = new String(msqg);
		this.tenqg = new String(tenqg);
		this.tenthudo = new String(tenthudo);
		this.GDP = GDP;
	}

	public QuocGia(QuocGia qg) {
		msqg = new String(qg.msqg);
		tenqg = new String(qg.tenqg);
		tenthudo = new String(qg.tenthudo);
		GDP = qg.GDP;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma so quoc gia: ");
		msqg = sc.nextLine();
		System.out.println("nhap ten quoc gia: ");
		tenqg = sc.nextLine();
		System.out.println("nhap ten thu do: ");
		tenthudo = sc.nextLine();
		System.out.println("nhap GDP: ");
		GDP = sc.nextFloat();
	}

	public void in() {
		System.out.println("ma so quoc gia: " + msqg + "\nten quoc gia: " + tenqg + "\nten thu do: " +tenthudo + "\nGDP: " + GDP );
	}
	
	public String toString() {
		return ("ma so quoc gia: " + msqg + "\nten quoc gia: " + tenqg + "\nten thu do: " +tenthudo + "\nGDP: " + GDP );
	}
	
	
	public float getGDP() {
		return GDP;
	}

	public void setGDP(float gDP) {
		GDP = gDP;
	}

	public static void main(String[] args) {
		QuocGia gq1 = new QuocGia();
		gq1.nhap();
		gq1.in();
		QuocGia gq2= new QuocGia(gq1);
		gq2.in();
	}

}
