package lab09q01;

public class Bus extends Transport {

    public Bus(String vehicleNumber, double distanceTravelled) {
        super(vehicleNumber, distanceTravelled);
    }

    @Override
    public double calculateFare() {
        return 10 * distanceTravelled;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Bus ---");
        super.displayDetails();
    }
}