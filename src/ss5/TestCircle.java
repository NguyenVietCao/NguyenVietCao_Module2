package ss5;
import java.util.Scanner;
public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập bán kính");
        int banKinh = sc.nextInt();
        Circle circle = new Circle(banKinh);
        System.out.println("Diện tích hình tròn là :" + circle.getAre());
    }
}
