public class WIFIDecorator extends EDD{
    public  WIFIDecorator(ElectronicDevice decoratedDevice) {
        super(decoratedDevice);
    }

    public void turnOn() {
        super.turnOn();
        System.out.println("WiFi is connected");
    }

    public void turnOff() {
        super.turnOff();
        System.out.println("WiFi is disconnected");
    }
}
