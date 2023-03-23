package ss15;

import java.util.Scanner;

public class UseIllegalTriangleException {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        try {
            System.out.println("Nhập cạnh a của tam giác:");
            a = Integer.parseInt(scanner.nextLine());

            System.out.printf("Nhập cạnh b của tam giác:");
            b = Integer.parseInt(scanner.nextLine());

            System.out.printf("Nhập cạnh c của tam giác:");
            c = Integer.parseInt(scanner.nextLine());
            checkTriangle(a, b, c);

        } catch (IllegalTriangleException | NumberFormatException e) {
            System.out.printf(e.getMessage());
        }
    }

    // kiểm tra phải tam giác không
    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Không phải tam giác");
        }
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Không phải tam giác");
        } else {
            throw new IllegalTriangleException("Là tam giác");
        }
    }
}





