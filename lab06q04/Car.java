package lab06q04;

public class Car extends Vehicle {
    int engineCapacity;
    double topSpeed;

    public Car() {
        super();
        this.engineCapacity = 0;
        this.topSpeed = 0.0;
    }

    public Car(String vehicleName, int engineCapacity, double topSpeed) {
        super(vehicleName);
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    @Override
    public double calculateSpeed() {
        return topSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Engine Capacity: " + engineCapacity + "CC");
        System.out.println("Top Speed: " + calculateSpeed() + " km/h");
    }
}