class Student {
    protected int rollNo;
    protected String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class problem_19 extends Student {

    private int marks1, marks2, marks3;

    public problem_19(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    public void displayResult() {
        displayStudent();

        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        problem_19 r = new problem_19(101, "Dharmik", 80, 75, 90);
        r.displayResult();
    }
}