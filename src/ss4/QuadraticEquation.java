package ss4;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số bậc 2");
        float a = scanner.nextFloat();
        System.out.printf("Nhập hệ só bậc 1");
        float b = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhập hằng số tự do");
        float c = Integer.parseInt(scanner.nextLine());
    }
}
