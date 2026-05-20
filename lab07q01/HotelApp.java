package lab07q01;

public class HotelApp {
    public static void main(String[] args) {

        StandardRoom standard = new StandardRoom();
        standard.displayRoomDetails();

        System.out.println();

        LuxurySuite luxury = new LuxurySuite("305", "Alice Green", 3, true);
        luxury.displayRoomDetails();
    }
}