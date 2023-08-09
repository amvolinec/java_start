package SalaryProgramm;

public class Employee {
    String name;
    String surname;
    double salary;
    int id;

    static int idGenerator = 1;

    public Employee() {
        this.id = idGenerator;
        idGenerator++;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.salary = SalaryRate.salary;
        this.id = idGenerator;
        idGenerator++;
    }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.id = idGenerator;
        idGenerator++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
}
