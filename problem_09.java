public class problem_09 {

    // Data fields
    double width;
    double height;

    // Constructor
    public problem_9(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Method to display details
    public void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    // Main method
    public static void main(String[] args) {

        // Create two problem_9 objects
        problem_9 r1 = new problem_9(4, 40);
        problem_9 r2 = new problem_9(3.5, 35.9);

        // Display details
        System.out.println("problem_9 1:");
        r1.display();

        System.out.println("\nproblem_9 2:");
        r2.display();

        // Compare areas
        if (r1.getArea() > r2.getArea()) {
            System.out.println("\nproblem_9 1 has a larger area.");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("\nproblem_9 2 has a larger area.");
        } else {
            System.out.println("\nBoth problem_9s have equal area.");
        }
    }
}
