package lab06q04;

public class VehicleApp {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println("=== Car (Default Constructor) ===");
        System.out.println("Default Speed: " + car.calculateSpeed());
        System.out.println("Scaled Speed (x1.5): " + car.calculateSpeed(1.5));
        car.displayVehicleDetails();

        System.out.println();

        Bicycle bicycle = new Bicycle("Mountain Bike", 21, 30.0);
        System.out.println("=== Bicycle (Parameterized Constructor) ===");
        System.out.println("Max Speed: " + bicycle.calculateSpeed());
        System.out.println("Scaled Speed (x1.2): " + bicycle.calculateSpeed(1.2));
        bicycle.displayVehicleDetails();
    }
}