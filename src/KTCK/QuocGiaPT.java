package KTCK;

import java.util.Scanner;

public class QuocGiaPT extends QuocGia {
	private float ttho;
	private char chluc;
	private float dtich;
	
	
	public QuocGiaPT() {
		super();
		ttho = 0.0f;
		chluc = ' ';
		dtich = 0.0f;
	}


	public QuocGiaPT(float ttho, char chluc, float dtich) {
		super();
		this.ttho = ttho;
		this.chluc = chluc;
		this.dtich = dtich;
	}
	
	public QuocGiaPT( QuocGiaPT qgpt) {
		super(qgpt);
		ttho = qgpt.ttho;
		chluc = qgpt.chluc;
		dtich = qgpt.dtich;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap tuoi tho: ");
		ttho = sc.nextFloat();
		sc.nextLine();
		System.out.println("nhap chau luc (A: Á,W: Âu, M: Mỹ, U: Úc, P: Phi):  ");
		chluc = sc.nextLine().charAt(0);
		System.out.println("nhap dien tich: ");
		dtich = sc.nextFloat();
	}
	
	public void in() {
		super.in();
		 System.out.println("tuoi: " + ttho + "\nchau luc: "+ chluc + "\ndientich: " + dtich + "\n");
	}
	
	public String toString() {
		return super.toString() + ("tuoi: " + ttho + "\nchau luc: "+ chluc + "\ndientich: " + dtich+ "\n");
	}
	
	
	public char getchluc() {
		return chluc;
	}
	
	
	public static void main(String[] args) {
//		QuocGiaPT pt = new QuocGiaPT();
//		pt.nhap();
//		pt.in();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so luongquoc gia");
		int n = sc.nextInt();
		QuocGiaPT quocGiaPT[] = new QuocGiaPT[n];
//		QuocGiaPT quocGiaPT = new QuocGiaPT[n];
		for(int i=0; i<n ; i++) {
			quocGiaPT[i] = new QuocGiaPT();
			System.out.println("quoc gia thứ " +(i+1)+": ");
			quocGiaPT[i].nhap();
		}
		for(int i=0; i<n ;i++) {
			System.out.println("quoc gia thứ " +(i+1)+": ");
			quocGiaPT[i].in();
		}
		
		System.out.println("quoc gia co GDP lơn hơn 500\n");
		for(int i =0; i<n; i++) {
			if(quocGiaPT[i].getGDP() > 500  && (quocGiaPT[i].getchluc()=='P' || quocGiaPT[i].getchluc()=='p') ) {
				quocGiaPT[i].in();
				
			}
		}
		
		System.out.println("\n GDP trung bình theo từng châu lục\n");
		
		char cacchau[]= {'A', 'W', 'M', 'U', 'P'};		
		for (char ch: cacchau) {
			float tong =0;
			int dem = 0;
			for(int i=0; i<n; i++) {
				if(quocGiaPT[i].getchluc() == ch) {
					tong += quocGiaPT[i].getGDP();
					dem ++;
				}
			}
			if(dem >0) {
				System.out.println("chau " + ch + ": " + tong/dem);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
