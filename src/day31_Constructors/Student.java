package day31_Constructors;

public class Student {

    public String name;
    public int age;
    public char gender;
    public char garade;
    public int id;

    public Student(String name, int age, char gender, char garade, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.garade = garade;
        this.id = id;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", garade=" + garade +
                ", id=" + id +
                '}';
    }
}
