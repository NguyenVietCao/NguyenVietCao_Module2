package ss5;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập lớp");
        String classes = sc.nextLine();
        student.setName(name);
        student.setClasses(classes);
        System.out.println(student.toString(name, classes));
    }
}