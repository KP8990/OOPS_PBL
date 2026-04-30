public class problem_06 {
    
    // Data fields with default values
    double width = 1;
    double height = 1;

    // No-argument constructor
    public problem_6() {
        // default values already set
    }

    // Parameterized constructor
    public problem_6(double width, double height) {
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

    // Main method for testing
    public static void main(String[] args) {
        // Using no-arg constructor
        problem_6 r1 = new problem_6();
        System.out.println("Rectangle 1:");
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        // Using parameterized constructor
        problem_6 r2 = new problem_6(5, 3);
        System.out.println("\nRectangle 2:");
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
    }
}
