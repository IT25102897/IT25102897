package lab09q01;

public abstract class Transport {
    String vehicleNumber;
    double distanceTravelled;

    public Transport(String vehicleNumber, double distanceTravelled) {
        this.vehicleNumber = vehicleNumber;
        this.distanceTravelled = distanceTravelled;
    }

    public abstract double calculateFare();

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Distance Travelled: " + distanceTravelled + " km");
        System.out.println("Fare: $" + calculateFare());
    }
}