package SalaryProgramm;

import java.util.ArrayList;
import java.util.List;

import static java.lang.reflect.Array.get;

public class PayrollCalculation {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(); // initialization our employers list

//        employees.add(new Employee()); //add employer to our employers list
//        employees.get(0).setName("John");
//        employees.get(0).setSurname("Travolta");
//        employees.get(0).setSalary(5250.00);

        employees.add(new Employee("Alex", "Brain", 10000.00));
        employees.add(new Employee("John", "Travolta", 5250.00));
        employees.add(new Employee("Ameli", "Gravedonna", 7200.00));
        employees.add(new Employee("Pedro", "Almodovar"));

        showEmployer(employees, 0);
        showEmployer(employees, 1);
        showEmployer(employees, 2);
        showEmployer(employees, 3);


        // this is one of all variant
//        Employee alex = new Employee("Alex", "Brain", 10000.00);
//        employees.add(alex);

        // using getters and setters
//        Employee johnWeek = new Employee();
//        johnWeek.setName("John");
//        johnWeek.setSurname("Week");
//        johnWeek.setSalary(1200.20);
//        System.out.println(johnWeek.getId());

        // using constructor from Employee class
//        Employee alex = new Employee("Alex", "Brain", 10000.00);
//        System.out.println(alex.getId());

//        Employee ameli = new Employee("Ameli", "Gravedona");
//        System.out.println(ameli.getId());
    }

    private static void showEmployer(List<Employee> employees, int index) {
        System.out.println(employees.get(index).getId() + " " + employees.get(index).getName() + " " + employees.get(index).getSurname() + " " + employees.get(index).getSalary());
    }
}
