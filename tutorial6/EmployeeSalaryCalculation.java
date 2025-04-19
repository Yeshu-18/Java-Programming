abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Alice", 5000);
        Employee partTime = new PartTimeEmployee("Bob", 20, 80);

        System.out.println(fullTime.name + "'s Salary: $" + fullTime.calculateSalary());
        System.out.println(partTime.name + "'s Salary: $" + partTime.calculateSalary());
    }
}