package ss7.resizeable;

import java.util.Scanner;

public class DisplayShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Shape shape =new Shape() {
//            @Override
//            public void resize(double percent) {
//
//            }
//        };
//        System.out.println("Nhập Phần Trăm Muốn Thay Đổi:");

        // Hình Tròn:
        Circle circle = new Circle();
        // Bán kính
        System.out.println("Nhập bán kính");
        double radius = Double.parseDouble(scanner.nextLine());
        circle.setRadius(radius);
        // Diện tích hình tròn
        System.out.println("Diện tích hình tròn");
        System.out.println(circle);

        //Hình Chữ Nhật:
        Rectangle rectangle = new Rectangle();
        // Chiều dài
        System.out.println("Nhập chiều dài");
        double height = Double.parseDouble(scanner.nextLine());
        rectangle.setHeight(height);
        // Chiều Rộng:
        System.out.println("Nhập chiều rộng");
        double width = Double.parseDouble(scanner.nextLine());
        rectangle.setWidth(width);
        // Diện tích hình chữ nhật:
        System.out.println("Diện tích hình chữ nhật");
        System.out.println(rectangle);

        // Hình vuông
        Square square = new Square();
        System.out.println("Nhập cạnh hình vuông");
        double w = Double.parseDouble(scanner.nextLine());
        square.setWidth(w);
        System.out.println("Diện tích hình vuông" + square);
    }
}
