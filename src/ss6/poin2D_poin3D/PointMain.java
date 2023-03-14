package ss6.poin2D_poin3D;

import java.util.Scanner;

public class PointMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point2D point2D = new Point2D();
        System.out.println("Nhập x");
        float x = scanner.nextFloat();
        System.out.println("Nhập y:");
        float y = scanner.nextFloat();
        point2D.setXY(x, y);
        System.out.println("Mảng 2D");
        System.out.println(point2D.toString());
        Point3D point3D = new Point3D();
        System.out.println("Nhập x");
        x = scanner.nextFloat();
        System.out.println("Nhập y:");
        y = scanner.nextFloat();
        System.out.println("Nhập z");
        float z = scanner.nextFloat();
        point3D.setXYZ(x, y, z);
        System.out.println("Mang 3d");
        System.out.println(point3D.toString());

    }
}
