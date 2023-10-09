abstract class EDD implements ElectronicDevice{
    protected ElectronicDevice decoratedDevice;

    public EDD(ElectronicDevice decoratedDevice) {
        this.decoratedDevice = decoratedDevice;
    }

    public void turnOn() {
        decoratedDevice.turnOn();
    }

    public void turnOff() {
        decoratedDevice.turnOff();
    }
}
