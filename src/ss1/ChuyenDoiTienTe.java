package ss1;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời Nhập số tiền USD: ");
        usd = sc.nextDouble();
        double change = usd * 23000;
        System.out.println("GIÁ TRỊ VNĐ : " + change);
    }
}
