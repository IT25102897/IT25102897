package lab09q05;

public class ContractEmployee extends Employee implements Payable {
    double hourlyRate;
    int hoursWorked;

    public ContractEmployee(String empId, String name, double hourlyRate, int hoursWorked) {
        super(empId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void generatePayslip() {
        System.out.println("--- Payslip (Contract Employee) ---");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employment Type: Contract");
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}