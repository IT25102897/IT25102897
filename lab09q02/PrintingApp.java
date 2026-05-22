package lab09q02;

public class PrintingApp {
    public static void main(String[] args) {

        Printable[] printables = new Printable[4];

        printables[0] = new Report("Annual Report", "John Perera", "2025-01-01");
        printables[1] = new Report("Lab Report", "Alice Green", "2025-03-15");
        printables[2] = new Invoice("INV-001", "David Silva", 1500.00);
        printables[3] = new Invoice("INV-002", "Sarah Brown", 2350.50);

        for (Printable p : printables) {
            p.printDetails();
            System.out.println();
        }
    }
}