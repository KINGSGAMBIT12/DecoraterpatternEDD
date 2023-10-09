public class Main {
    public static void main(String[] args) {
        ElectronicDevice basicTelevision = new TV();
        ElectronicDevice smartphone = new Phone();

        ElectronicDevice bluetoothTelevision = new BluetoothDecorator(new TV());
        ElectronicDevice bluetoothSmartphone = new BluetoothDecorator(new Phone());

        ElectronicDevice wifiTelevision = new WIFIDecorator(new TV());
        ElectronicDevice wifiSmartphone = new WIFIDecorator(new Phone());


        System.out.println("Basic TV:");
        basicTelevision.turnOn();
        basicTelevision.turnOff();
        System.out.println();

        System.out.println("Phone:");
        smartphone.turnOn();
        smartphone.turnOff();
        System.out.println();

        System.out.println("Bluetooth-enabled TV:");
        bluetoothTelevision.turnOn();
        bluetoothTelevision.turnOff();
        System.out.println();

        System.out.println("Bluetooth-enabled Phone:");
        bluetoothSmartphone.turnOn();
        bluetoothSmartphone.turnOff();
        System.out.println();

        System.out.println("WiFi-enabled TV:");
        wifiTelevision.turnOn();
        wifiTelevision.turnOff();
        System.out.println();

        System.out.println("WiFi-enabled Phone:");
        wifiSmartphone.turnOn();
        wifiSmartphone.turnOff();
    }
    }
