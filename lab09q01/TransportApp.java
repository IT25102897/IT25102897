package lab09q01;

public class TransportApp {
    public static void main(String[] args) {

        Bus bus = new Bus("B-1234", 15.0);
        bus.displayDetails();

        System.out.println();

        Taxi taxi = new Taxi("T-5678", 10.0);
        taxi.displayDetails();
    }
}