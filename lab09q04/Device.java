package lab09q04;

public class Device {
    String deviceId;
    String deviceType;
    static int deviceCount;

    static {
        deviceCount = 100;
        System.out.println("Static block executed. Device count initialized to: " + deviceCount);
    }

    public Device(String deviceId, String deviceType) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        deviceCount++;
    }

    public void displayDeviceInfo() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Device Type: " + deviceType);
    }

    public static void displayDeviceCount() {
        System.out.println("Total Device Count: " + deviceCount);
    }
}