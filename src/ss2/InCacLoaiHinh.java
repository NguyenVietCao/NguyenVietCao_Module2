package ss2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class InCacLoaiHinh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int d;
        System.out.println("Nhap chieu dai");
        d = Integer.parseInt(scanner.nextLine());
        int r;
        System.out.println("Nhap chieu rong");
        r = Integer.parseInt(scanner.nextLine());

        // Hình chữ nhật

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= d; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        //Hình Tam Giác Thuận

        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        //Hình Tam Giác Ngược

        for (int i = d; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // Hình Tam Giác Cân

        for (int i = 0; i < d; i++) {
            for (int j = d; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i + 1) * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

}
