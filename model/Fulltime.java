package model;

public class Fulltime extends Info {
    public double OTtime;

    public Fulltime() {
    }

    public Fulltime(int id, int age, int workday, String surname, String name, String birthday, double salary,
            double oTtime) {
        super(id, age, workday, surname, name, birthday, salary);
        OTtime = oTtime;
    }

    public double calSalary() {
        return (workday * salary + OTtime * 100000);
    }

    @Override
    public void setInfo() {
        super.setInfo();
        System.out.println("OT time: ");
        this.OTtime = sc.nextDouble();
        this.salary = this.calSalary();
        System.out.println(this.salary);

    }

    @Override
    public String toString() {
        return super.toString() + " OTtime=" + OTtime;
    }

}
