public class Phone implements ElectronicDevice {

        @Override
        public void turnOn() {
            System.out.println("Phone is turned on");
        }

        @Override
        public void turnOff() {
            System.out.println("Phone is turned off");
        }
    }


