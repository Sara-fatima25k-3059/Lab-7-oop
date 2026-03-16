public class TASK6LAB7 {

        public static void main(String[] args) {
            Transport t1 = new Bus();
            Transport t2 = new Train();
            Transport t3 = new Taxi();

            t1.fare();
            t2.fare();
            t3.fare();
        }
    }

    class Transport {
        public void fare() {
            System.out.println("Calculating fare");
        }
    }

    class Bus extends Transport {
        @Override
        public void fare() {
            System.out.println("Bus fare is $2 per km");
        }
    }

    class Train extends Transport {
        @Override
        public void fare() {
            System.out.println("Train fare is $1.5 per km");
        }
    }

    class Taxi extends Transport {
        @Override
        public void fare() {
            System.out.println("Taxi fare is $3 per km");
        }
    }

