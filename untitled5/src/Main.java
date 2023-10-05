import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of devices to create (1-20): ");
        int numDevices = scanner.nextInt();

        ArrayList<Device> devices = new ArrayList<>();

        for (int i = 0; i < numDevices; i++) {
            int deviceType = random.nextInt(3);
            double price = random.nextDouble() * 1000;
            double weight = random.nextDouble() * 1000;

            switch (deviceType) {
                case 0:
                    double screenSize = random.nextDouble() * 6;
                    int cameraResolution = random.nextInt(20) + 5;
                    devices.add(new Smartphone("Smartphone", price, weight, screenSize, cameraResolution));
                    break;
                case 1:
                    int ram = random.nextInt(8) + 4;
                    int storage = random.nextInt(500) + 128;
                    devices.add(new Laptop("Laptop", price, weight, ram, storage));
                    break;
                case 2:
                    String[] osOptions = {"iOS", "Android", "Windows"};
                    String os = osOptions[random.nextInt(osOptions.length)];
                    devices.add(new Tablet("Tablet", price, weight, os));
                    break;
            }
        }

        ArrayList<String> deviceTypes = new ArrayList<>();
        double totalPrice = 0;
        double totalWeight = 0;

        for (Device device : devices) {
            if (!deviceTypes.contains(device.getType())) {
                deviceTypes.add(device.getType());
            }
            totalPrice += device.getPrice();
            totalWeight += device.getWeight();

            System.out.println("Number of distinct device types created: " + deviceTypes.size());
            System.out.println("Total price of all devices: $" + String.format("%.2f", totalPrice));
            System.out.println("Total weight of all devices: " + String.format("%.2f", totalWeight) + " grams");

        }

    }
}
