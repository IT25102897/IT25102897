package lab07q01;

public class Room {
    String roomNumber;
    String guestName;
    int nightsStayed;

    public Room() {
        this.roomNumber = "000";
        this.guestName = "Unknown";
        this.nightsStayed = 0;
    }

    public Room(String roomNumber, String guestName, int nightsStayed) {
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.nightsStayed = nightsStayed;
    }

    public void displayRoomDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Nights: " + nightsStayed);
    }

    public double calculateRoomCost() {
        return 150.00;
    }

    public double calculateRoomCost(int discountPerNight) {
        double baseCost = calculateRoomCost();
        return (baseCost - discountPerNight) * nightsStayed;
    }
}