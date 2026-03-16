public class TASK4LAB7 {

    public static void main(String[] args) {

        Employees e1 = new Managers();
        Employees e2 = new Developer();
        Employees e3 = new Intern();

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();

    }
}

    class Employees {

        public void calculateSalary() {
            System.out.println("Calculating employee salary");
        }

    }

    class Managers extends Employees {

        @Override
        public void calculateSalary() {
            int salary = 80000;
            System.out.println("Manager salary is " + salary);
        }

    }

    class Developer extends Employees {

        @Override
        public void calculateSalary() {
            int salary = 60000;
            System.out.println("Developer salary is " + salary);
        }

    }

    class Intern extends Employees {

        @Override
        public void calculateSalary() {
            int salary = 20000;
            System.out.println("Intern stipend is " + salary);
        }

    }

