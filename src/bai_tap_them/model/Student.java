package bai_tap_them.model;

public class Student extends Person {
    private String classStudent;
    private Double point;

    public Student() {
    }

    public Student(String classStudent, Double point) {
        this.classStudent = classStudent;
        this.point = point;
    }

    public Student(String id, String name, String birthDay, String gender, String classStudent, Double point) {
        super(id, name, birthDay, gender);
        this.classStudent = classStudent;
        this.point = point;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }


    public void delete() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "classStudent='" + classStudent + '\'' +
                ", point=" + point +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
