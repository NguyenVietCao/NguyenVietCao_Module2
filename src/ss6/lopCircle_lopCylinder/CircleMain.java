package ss6.lopCircle_lopCylinder;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Nhập bán kính");
        double radius = Double.parseDouble(scanner.nextLine());
        circle.setRadius(radius);
        System.out.println("Nhập màu sắc");
        String color  = scanner.nextLine();
        circle.getRadius(radius);
        System.out.println("Bán kính:");
        System.out.println(circle.toString());
        circle.getAcreage();
        System.out.println("Diện tích hình tròn");
        System.out.println( circle.getAcreage());
    }
}
