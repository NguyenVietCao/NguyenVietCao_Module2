package bai_tap_them.controller;

import bai_tap_them.service.StudentService;
import bai_tap_them.service.TeacherService;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DisplayCodeGym {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới giảng viên hoặc học sinh\n" +
                    "2. Xóa giảng viên hoặc học sinh\n" +
                    "3. Xem danh sách giảng viên hoặc học sinh\n" +
                    "4. Thoát\n" +
                    "Chọn chức năng:");
            int n = parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    System.out.println("Bạn muốn thêm :\n" +
                            "1:Học viên\n" +
                            "2:Giáo viên\n" +
                            "Số khác: không thêm nữa");
                    int a = parseInt(scanner.nextLine());
                    if (a == 1) {
                        studentService.add();
                    } else if (a == 2) {
                        teacherService.add();
                    } else {
                        System.out.println("Bạn đã không thêm nữa");
                    }
                    break;
                case 2:
                    System.out.println("Bạn muốn xóa :\n" +
                            "1:Học viên\n" +
                            "2:Giáo viên\n" +
                            "Số khác: không xóa nữa");
                    int c = parseInt(scanner.nextLine());
                    if (c == 1) {
                        studentService.delete();
                    } else if (c == 2) {
                        studentService.delete();
                    } else {
                        System.out.println("Bạn đã không xóa nữa");
                    }
                    break;
                case 3:
                    System.out.println("Bạn muốn xem danh sách của ai:\n" +
                            "1:Học viên\n" +
                            "2:Giảng viên\n" +
                            "3: Cả 2"+
                            "số khác: không xem nữa");
                    int b = parseInt(scanner.nextLine());
                    if (b == 1) {
                        studentService.display();
                    } else if (b == 2) {
                        teacherService.display();
                    } else if (b==3) {
                        studentService.display();
                        teacherService.display();
                    } else {
                        System.out.println("Bạn đã không xem nữa");
                    }
                    break;
                case 4:
                    System.out.println("Bạn đã thoát");
                    check = false;
                    break;
                default:
                    System.out.println("Bạn đã chọn sai số xin chọn lại");

            }
        } while (check);
    }
}
