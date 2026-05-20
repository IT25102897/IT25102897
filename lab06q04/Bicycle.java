package lab06q04;

public class Bicycle extends Vehicle {
    int gearCount;
    double maxPedalSpeed;

    public Bicycle() {
        super();
        this.gearCount = 0;
        this.maxPedalSpeed = 0.0;
    }

    public Bicycle(String vehicleName, int gearCount, double maxPedalSpeed) {
        super(vehicleName);
        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }

    @Override
    public double calculateSpeed() {
        return maxPedalSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Gear Count: " + gearCount);
        System.out.println("Max Pedal Speed: " + calculateSpeed() + " km/h");
    }
}