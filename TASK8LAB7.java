public class TASK8LAB7 {
        public static void main(String[] args) {
            SmartDevice[] devices = {
                    new SmartLight(),
                    new SmartFan(),
                    new SmartAC()
            };

            for (SmartDevice device : devices) {
                device.turnOn();
            }
        }
    }

    class SmartDevice {
        public void turnOn() {
            System.out.println("Turning on device");
        }
    }

    class SmartLight extends SmartDevice {
        @Override
        public void turnOn() {
            System.out.println("Smart Light is ON");
        }
    }

    class SmartFan extends SmartDevice {
        @Override
        public void turnOn() {
            System.out.println("Smart Fan is ON");
        }
    }

    class SmartAC extends SmartDevice {
        @Override
        public void turnOn() {
            System.out.println("Smart AC is ON");
        }
    }

