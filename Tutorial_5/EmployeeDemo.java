package assignment5;
// Base class Employee
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Salary: $" + salary);
    }
}

// Derived class Manager
class Manager extends Employee {
    private double incentive;

    public Manager(String name, double salary, double incentive) {
        super(name, salary);
        this.incentive = incentive;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Incentive: $" + incentive);
    }
}

// Derived class Developer
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Main class to test
public class EmployeeDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 80000, 5000);
        Developer developer = new Developer("Bob", 70000, "Java");

        manager.displayDetails();
        developer.displayDetails();
    }
}