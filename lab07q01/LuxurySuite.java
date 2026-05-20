package lab07q01;

public class LuxurySuite extends Room {
    boolean extraServicesIncluded;

    public LuxurySuite() {
        super();
        this.extraServicesIncluded = false;
    }

    public LuxurySuite(String roomNumber, String guestName, int nightsStayed, boolean extraServicesIncluded) {
        super(roomNumber, guestName, nightsStayed);
        this.extraServicesIncluded = extraServicesIncluded;
    }

    @Override
    public double calculateRoomCost() {
        return (200.0 * nightsStayed) + (extraServicesIncluded ? 75.0 : 0.0);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("--- Luxury Suite ---");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Nights: " + nightsStayed);
        System.out.println("Breakfast & Airport Pickup: " + (extraServicesIncluded ? "Included" : "Not Included"));
        System.out.println("Total Cost: $" + calculateRoomCost());
        System.out.println("Discounted Cost (per night $15 off): $" + calculateRoomCost(15));
    }
}