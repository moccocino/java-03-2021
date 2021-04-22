package Lesson5.HomeWork;

public class employer {
    private static int employerId = 0;
    private String name;
    private String position;
    private String email;
    private String Number;
    private int salary;
    private int age;

    public employer() {
        employerId++;
    }

    public employer(String name, String position, String email, String Number, int salary, int age) {
        employerId++;
        this.name = name;
        this.position = position;
        this.email = email;
        this.Number = Number;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "employer{" +
                ", Имя='" + name + '\'' +
                ", Позиция='" + position + '\'' +
                ", Почта='" + email + '\'' +
                ", Номер='" + Number + '\'' +
                ", Должность=" + salary +
                ", Возраст=" + age +
                '}';
    }
}
