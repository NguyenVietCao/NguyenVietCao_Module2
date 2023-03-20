package bai_tap_them.model;

public class Person {
    protected String id;
    protected String name;
    protected String birthDay;
    protected String gender;


    public Person() {
    }

    public Person(String id, String name, String birthDay, String gender) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
