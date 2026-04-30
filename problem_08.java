public class problem_08 {

    // Data members
    private int x;
    private int y;

    // Default constructor (x = 5, y = 5)
    public problem_8() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    public problem_8(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public problem_8(problem_8 p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Display method
    public void display() {
        System.out.println("problem_8 coordinates: (" + x + ", " + y + ")");
    }

    // Main method to test
    public static void main(String[] args) {

        // Default constructor
        problem_8 p1 = new problem_8();
        System.out.print("Default Constructor: ");
        p1.display();

        // Parameterized constructor
        problem_8 p2 = new problem_8(10, 20);
        System.out.print("Parameterized Constructor: ");
        p2.display();

        // Copy constructor
        problem_8 p3 = new problem_8(p2);
        System.out.print("Copy Constructor: ");
        p3.display();
    }
}
