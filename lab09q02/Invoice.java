package lab09q02;

public class Invoice implements Printable {
    String invoiceId;
    String customerName;
    double amount;

    public Invoice(String invoiceId, String customerName, double amount) {
        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public void printDetails() {
        System.out.println("--- Invoice ---");
        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: $" + amount);
    }
}