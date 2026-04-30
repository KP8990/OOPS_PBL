import java.util.Scanner;

public class problem_11 {
    private String collegeName;

    public problem_11(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        private String studentName;
        private String course;

        public void acceptData() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter student name: ");
            studentName = sc.nextLine();

            System.out.print("Enter course: ");
            course = sc.nextLine();
            sc.close();
        }

        public void displayData() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); 
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
    public static void main(String[] args) {

        problem_11 college = new problem_11("SSASIT College");

        problem_11.Admission admission = college.new Admission();

        admission.acceptData();
        admission.displayData();
    }
}
