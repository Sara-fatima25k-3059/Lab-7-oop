public class TASK3LAB7 {
    public static void main(String[] args) {

            Payment p1 = new CreditCard();
            Payment p2 = new DebitCard();
            Payment p3 = new PayPal();

            p1.processPayment();
            p2.processPayment();
            p3.processPayment();

        }
    }

    class Payment {

        public void processPayment() {
            System.out.println("Processing payment");
        }

    }

    class CreditCard extends Payment {

        @Override
        public void processPayment() {
            System.out.println("Processing payment through Credit Card");
        }

    }

    class DebitCard extends Payment {

        @Override
        public void processPayment() {
            System.out.println("Processing payment through Debit Card");
        }

    }

    class PayPal extends Payment {

        @Override
        public void processPayment() {
            System.out.println("Processing payment through PayPal");
        }

    }

