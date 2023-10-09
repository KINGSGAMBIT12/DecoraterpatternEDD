public class BluetoothDecorator extends EDD{
    public BluetoothDecorator(ElectronicDevice decoratedDevice) {
        super(decoratedDevice);
    }

    public void turnOn() {
        super.turnOn();
        System.out.println("Bluetooth is enabled");
    }

    public void turnOff() {
        super.turnOff();
        System.out.println("Bluetooth is disabled");
    }
}
