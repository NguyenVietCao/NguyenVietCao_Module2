package bai_tap_them.model;

public class Teacher extends Person {
    private String specialize;

    public Teacher(String specialize) {
        this.specialize = specialize;
    }

    public Teacher(String id, String name, String birthDay, String gender, String specialize) {
        super(id, name, birthDay, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "specialize='" + specialize + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
