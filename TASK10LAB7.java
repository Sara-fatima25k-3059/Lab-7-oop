public class TASK10LAB7 {
        public static void main(String[] args) {
            Course c1 = new ProgrammingCourse();
            Course c2 = new MathematicsCourse();
            Course c3 = new DesignCourse();

            int assignments = 80;
            int exams = 90;

            c1.calculateGrade(assignments, exams);
            c2.calculateGrade(assignments, exams);
            c3.calculateGrade(assignments, exams);
        }
    }

    class Course {
        public void calculateGrade(int assignments, int exams) {
            System.out.println("Calculating grade");
        }
    }

    class ProgrammingCourse extends Course {
        @Override
        public void calculateGrade(int assignments, int exams) {
            int grade = (int)(assignments * 0.4 + exams * 0.6);
            System.out.println("Programming Course Grade: " + grade);
        }
    }

    class MathematicsCourse extends Course {
        @Override
        public void calculateGrade(int assignments, int exams) {
            int grade = (int)(assignments * 0.3 + exams * 0.7);
            System.out.println("Mathematics Course Grade: " + grade);
        }
    }

    class DesignCourse extends Course {
        @Override
        public void calculateGrade(int assignments, int exams) {
            int grade = (int)(assignments * 0.5 + exams * 0.5);
            System.out.println("Design Course Grade: " + grade);
        }
    }

