package buoi5;

import java.util.Scanner;

public class SuDung {
    public static void main(String[] args) {
        // Tạo đối tượng HoaDon
        HoaDon hoaDon = new HoaDon();

        // Nhập thông tin 
        hoaDon.nhap();

        // In thông tin 
        hoaDon.in();

        
        float tongTien = hoaDon.tong();
        System.out.println("Tổng giá trị hóa đơn: " + tongTien);

       
        double tongTienSauKhiGiam = hoaDon.tongDiscount();
        System.out.println("Tổng giá trị sau khi giảm giá: " + tongTienSauKhiGiam);
    }
}
