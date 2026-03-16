public class TASK9LAB7 {

        public static void main(String[] args) {
            Ride r1 = new BikeRide();
            Ride r2 = new CarRide();
            Ride r3 = new LuxuryRide();

            double distance = 10;

            System.out.println("Bike Ride fare: $" + r1.calculateFare(distance));
            System.out.println("Car Ride fare: $" + r2.calculateFare(distance));
            System.out.println("Luxury Ride fare: $" + r3.calculateFare(distance));
        }
    }

    class Ride {
        public double calculateFare(double distance) {
            return 0;
        }
    }

    class BikeRide extends Ride {
        @Override
        public double calculateFare(double distance) {
            return 2 * distance;
        }
    }

    class CarRide extends Ride {
        @Override
        public double calculateFare(double distance) {
            return 3 * distance;
        }
    }

    class LuxuryRide extends Ride {
        @Override
        public double calculateFare(double distance) {
            return 5 * distance;
        }
    }

