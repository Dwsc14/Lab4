package model;

import java.util.Scanner;

public class Info {
    int id, age, workday;
    String surname, name, birthday;
    double salary;
    Scanner sc = new Scanner(System.in);

    public Info() {
    }

    public void setInfo() {
        System.out.println("id: ");
        this.id = sc.nextInt();
        sc.nextLine();

        System.out.println("Surname: ");
        this.surname = sc.nextLine();

        System.out.println("Name: ");
        this.name = sc.nextLine();

        System.out.println("Birthday: ");
        this.birthday = sc.nextLine();

        System.out.println("age: ");
        this.age = sc.nextInt();
        sc.nextLine();

        System.out.println("work day: ");
        this.workday = sc.nextInt();
        sc.nextLine();

        System.out.println("Salary per hours: ");
        this.salary = sc.nextDouble();
        sc.nextLine();

    }

    public void setId(int id) {
        this.id = id;
    }

    public Info(int id, int age, int workday, String surname, String name, String birthday, double salary) {
        this.id = id;
        this.age = age;
        this.workday = workday;
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id + ", surname=" + surname + ", name=" + name
                + ", age=" + age + ", workday=" + workday + ", birthday=" + birthday + ", salary=" + salary;
    }

}
