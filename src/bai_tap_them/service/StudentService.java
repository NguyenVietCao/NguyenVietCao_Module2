package bai_tap_them.service;

import bai_tap_them.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StudentService implements IFunction {
    static ArrayList<Student> students = new ArrayList<>();
   static Scanner scanner = new Scanner(System.in);

    @Override
    public  void add() {
        System.out.println("NHập id");
        String id = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                System.out.println("id sinh viên có rồi");
                return;
            } else {
                count++;
            }
        }
        if (count == students.size()) {
        }
        System.out.println("NHập tên ");
        String name = scanner.nextLine();
        System.out.println("NHập ngày sinh ");
        String dayBirth = scanner.nextLine();
        System.out.println("NHập giới tính ");
        String gender = scanner.nextLine();
        System.out.println("NHập lớp học ");
        String classStudent = scanner.nextLine();
        System.out.printf("Nhập điểm : ");
        double point = Double.parseDouble(scanner.nextLine());
        Student newStudent = new Student(id,name,dayBirth,gender,classStudent,point);
        students.add(newStudent);
    }

    @Override
    public void delete(){
        System.out.println("Nhập id sinh viên cần xóa");
        String id = scanner.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                System.out.println("Bạn có muốn xoá sinh viên có id=" + id + " này ko  " +
                        "\n 1. Có" +
                        "\n 2. Không");
                int choice = parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        students.remove(students.get(i));
                        System.out.println("Bạn xoá thành công");
                        break;
                    case 2:
                        System.out.println("Bạn đã không xoá");
                }
                return;
            }
        }
        System.out.println("không tìm thấy id sinh viên này");

    }

    @Override
    public void exit() {

    }

    @Override
    public void display() {
        System.out.println("Danh sach hoc vien:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
