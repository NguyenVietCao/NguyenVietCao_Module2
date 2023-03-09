package ss4;

import java.util.Scanner;

public class QuadraticEquation {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số bậc 2");
        float a = QuadraticEquation.scanner.nextFloat();
        System.out.println("Nhập hệ só bậc 1");
        float b = QuadraticEquation.scanner.nextFloat();
        System.out.println("Nhập hằng số tự do");
        float c = scanner.nextFloat();
        QuadraticEquation.giaiPtBac2(a, b, c);
    }

    public static void giaiPtBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));

            }
            return;
        }
        // Tính delta
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        // Tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có hai nghiệm là: " + "x1 = " + x1 + "và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép :" + " x1 = x2 " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
