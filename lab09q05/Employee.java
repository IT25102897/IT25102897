package lab09q05;

public abstract class Employee {
    String empId;
    String name;

    public Employee(String empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public abstract double calculateSalary();
}