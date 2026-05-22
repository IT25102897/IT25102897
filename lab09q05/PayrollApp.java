package lab09q05;

public class PayrollApp {
    public static void main(String[] args) {

        PermanentEmployee pe = new PermanentEmployee("E001", "John Perera", 3500.00);
        pe.generatePayslip();

        System.out.println();

        ContractEmployee ce = new ContractEmployee("E002", "Alice Green", 25.00, 160);
        ce.generatePayslip();
    }
}