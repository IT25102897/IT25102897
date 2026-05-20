package lab07q01;

public class StandardRoom extends Room {
    boolean wifiIncluded;

    public StandardRoom() {
        super();
        this.wifiIncluded = false;
    }

    public StandardRoom(String roomNumber, String guestName, int nightsStayed, boolean wifiIncluded) {
        super(roomNumber, guestName, nightsStayed);
        this.wifiIncluded = wifiIncluded;
    }

    @Override
    public double calculateRoomCost() {
        return 100.0 * nightsStayed;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("--- Standard Room ---");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Nights: " + nightsStayed);
        System.out.println("Wi-Fi Included: " + (wifiIncluded ? "Yes" : "No"));
        System.out.println("Total Cost: $" + calculateRoomCost());
        System.out.println("Discounted Cost (per night $10 off): $" + calculateRoomCost(10));
    }
}