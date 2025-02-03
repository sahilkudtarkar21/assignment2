abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
    public abstract void displayDetails();
}

class FullTimeEmployee extends Employee {
    private double monthlyRate;

    public FullTimeEmployee(String name, int id, double monthlyRate) {
        super(name, id);
        this.monthlyRate = monthlyRate;
    }

    @Override
    public double calculateSalary() {
        return monthlyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println(name + " (ID: " + id + ") - Full-Time, Salary: " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayDetails() {
        System.out.println(name + " (ID: " + id + ") - Part-Time, Salary: " + calculateSalary());
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Alice", 101, 50000),
            new PartTimeEmployee("Bob", 102, 1000, 20)
        };

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
