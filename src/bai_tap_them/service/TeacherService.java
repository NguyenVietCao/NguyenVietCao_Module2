package bai_tap_them.service;

import bai_tap_them.model.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class TeacherService implements IFunction {
    static ArrayList<Teacher>teachers = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public  void add() {
        System.out.println("NHập id");
        String id = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < teachers.size(); i++) {
            if (id == teachers.get(i).getId()) {
                System.out.println("id sinh viên có rồi");
                return;
            } else {
                count++;
            }
        }
        if (count == teachers.size()) {
        }
        System.out.println("NHập tên ");
        String name = scanner.nextLine();
        System.out.println("NHập ngày sinh ");
        String dayBirth = scanner.nextLine();
        System.out.println("NHập giới tính ");
        String gender = scanner.nextLine();
        System.out.println("NHập môn dạy: ");
        String specialize = scanner.nextLine();
        System.out.printf("Nhập điểm : ");
        double point = Double.parseDouble(scanner.nextLine());
        Teacher newTeacher = new Teacher(id,name,dayBirth,gender,specialize);
        teachers.add(newTeacher);
    }

    @Override
    public void delete() {
        System.out.println("Nhập id giáo viên cần xóa");
        String id = scanner.nextLine();
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == id) {
                System.out.println("Bạn có muốn xoá giáo viên có id=" + id + " này ko  " +
                        "\n 1. Có" +
                        "\n 2. Không");
                int choice = parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        teachers.remove(teachers.get(i));
                        System.out.println("Bạn xoá thành công");
                        break;
                    case 2:
                        System.out.println("Bạn đã không xoá");
                }
                return;
            }
        }
        System.out.println("không tìm thấy id giáo viên này");
    }

    @Override
    public void exit() {

    }

    @Override
    public void display() {
        System.out.println("Danh sach hoc vien:");
        for (Teacher s : teachers) {
            System.out.println(s);
        }
    }
}
