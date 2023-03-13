package ss6.LopPoin_MoveablePoint;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x:");
        float x = scanner.nextFloat();
        System.out.println("Nhập y:");
        float y = scanner.nextFloat();
        System.out.println("Nhập xSpeed");
        float xSpeed = scanner.nextFloat();
        System.out.println("Nhập ySpeed");
        float ySpeed = scanner.nextFloat();
        MovablePoint movablePoint =new MovablePoint(0,0,2,2);
        movablePoint.setX(x);
        movablePoint.setY(y);
        movablePoint.setXSpeed(xSpeed);
        movablePoint.setYSpeed(ySpeed);
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
        System.out.print(movablePoint.move());
    }
}
