public class mains {
    public static class Exam {
        String message;
        double price; 
        boolean status;

        public Exam() {
            message = "Good luck";
        }

        public Exam(String period, String level) {
        }

        public double getPrice() {
            return price;
        }

        public boolean isFinished() {
            return status;
        }
    }

    public static class Midterm extends Exam {
    }

    public static class CustomMidterm extends Exam {
        public CustomMidterm() {
            super(); // Call to parent class constructor
            System.out.println("Exam has started.");
        }
    }

    static Exam exam = new Midterm();

    public static void main(String[] args) {

        Exam exam1 = new Exam();
        System.out.println(exam1.message); // Output: Good luck

        Exam exam2 = new Exam("Fall", "Intermediate");
        CustomMidterm midterm = new CustomMidterm();
        System.out.println(exam.message);
    }
}
