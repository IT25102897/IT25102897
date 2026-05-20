package lab07q02;

public class RestaurantApp {
    public static void main(String[] args) {

        RegularMeal regular = new RegularMeal();
        regular.displayOrderDetails();

        System.out.println();

        ComboMeal combo = new ComboMeal("C102", "Alice Green", 2, true);
        combo.displayOrderDetails();
    }
}