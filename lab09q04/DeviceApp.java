package lab09q04;

public class DeviceApp {
    public static void main(String[] args) {

        Device.displayDeviceCount();
        System.out.println();

        Device d1 = new Device("D001", "Laptop");
        Device d2 = new Device("D002", "Smartphone");
        Device d3 = new Device("D003", "Tablet");

        System.out.println();

        d1.displayDeviceInfo();
        System.out.println();
        d2.displayDeviceInfo();
        System.out.println();
        d3.displayDeviceInfo();
        System.out.println();

        Device.displayDeviceCount();
    }
}