package lab07q02;

public class ComboMeal extends Meal {
    boolean includesDrinkAndDessert;

    public ComboMeal() {
        super();
        this.includesDrinkAndDessert = false;
    }

    public ComboMeal(String orderID, String customerName, int quantity, boolean includesDrinkAndDessert) {
        super(orderID, customerName, quantity);
        this.includesDrinkAndDessert = includesDrinkAndDessert;
    }

    @Override
    public double calculateBill() {
        return (15.00 * quantity) + (includesDrinkAndDessert ? 5.0 : 0.0);
    }

    @Override
    public void displayOrderDetails() {
        System.out.println("--- Combo Meal ---");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Includes Drink & Dessert: " + (includesDrinkAndDessert ? "Yes" : "No"));
        System.out.println("Total Bill: $" + calculateBill());
        System.out.println("Bill with $3 coupon: $" + calculateBill(3));
    }
}