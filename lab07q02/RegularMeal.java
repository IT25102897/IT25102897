package lab07q02;

public class RegularMeal extends Meal {
    boolean isVegetarian;

    public RegularMeal() {
        super();
        this.isVegetarian = true;
    }

    public RegularMeal(String orderID, String customerName, int quantity, boolean isVegetarian) {
        super(orderID, customerName, quantity);
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double calculateBill() {
        return 10.00 * quantity;
    }

    @Override
    public void displayOrderDetails() {
        System.out.println("--- Regular Meal ---");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Meal Type: " + (isVegetarian ? "Vegetarian" : "Non-Vegetarian"));
        System.out.println("Total Bill: $" + calculateBill());
        System.out.println("Bill with $2 coupon: $" + calculateBill(2));
    }
}