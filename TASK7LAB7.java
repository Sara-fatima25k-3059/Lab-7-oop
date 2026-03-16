public class TASK7LAB7 {

        public static void main(String[] args) {
            Restaurant r1 = new FastFoodRestaurant();
            Restaurant r2 = new FineDiningRestaurant();
            Restaurant r3 = new CafeRestaurant();

            double distance = 5;

            System.out.println("FastFood delivery fee: " + r1.calculateDeliveryFee(distance));
            System.out.println("FineDining delivery fee: " + r2.calculateDeliveryFee(distance));
            System.out.println("Cafe delivery fee: " + r3.calculateDeliveryFee(distance));
        }
    }

    class Restaurant {
        public double calculateDeliveryFee(double distance) {
            return 0;
        }
    }

    class FastFoodRestaurant extends Restaurant {
        @Override
        public double calculateDeliveryFee(double distance) {
            return 2 + 0.5 * distance;
        }
    }

    class FineDiningRestaurant extends Restaurant {
        @Override
        public double calculateDeliveryFee(double distance) {
            return 5 + 1.0 * distance;
        }
    }

    class CafeRestaurant extends Restaurant {
        @Override
        public double calculateDeliveryFee(double distance) {
            return 3 + 0.7 * distance;
        }
    }

