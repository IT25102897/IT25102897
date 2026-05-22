package lab09q01;

public class Taxi extends Transport {

    public Taxi(String vehicleNumber, double distanceTravelled) {
        super(vehicleNumber, distanceTravelled);
    }

    @Override
    public double calculateFare() {
        return (20 * distanceTravelled) + 50;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Taxi ---");
        super.displayDetails();
    }
}