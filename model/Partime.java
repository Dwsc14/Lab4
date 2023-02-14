package model;

public class Partime extends Info {
    public double discount;

    public Partime() {
    }

    public Partime(int id, int age, int workday, String surname, String name, String birthday, double salary,
            double discount) {
        super(id, age, workday, surname, name, birthday, salary);
        this.discount = discount;
    }

    public double calSalary() {
        return (workday * salary * discount);
    }

    

    @Override
    public void setInfo() {
        super.setInfo();
        System.out.println("OT time: ");
        this.discount = sc.nextDouble();
        System.out.println(this.calSalary());
        this.salary = this.calSalary();
    }

    @Override
    public String toString() {
        return super.toString() + " discount=" + discount;
    }
}