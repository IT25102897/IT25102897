package lab09q05;

public class PermanentEmployee extends Employee implements Payable {
    double monthlySalary;

    public PermanentEmployee(String empId, String name, double monthlySalary) {
        super(empId, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void generatePayslip() {
        System.out.println("--- Payslip (Permanent Employee) ---");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employment Type: Permanent");
        System.out.println("Monthly Salary: $" + calculateSalary());
    }
}