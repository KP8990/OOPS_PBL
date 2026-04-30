public class problem_10 {

    private String accountHolderName;
    private double balance;

    private static double interestRate = 5.0;

    public problem_10(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }
    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }
    public void display() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

    public static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to " + interestRate + "%\n");
    }

    public static void main(String[] args) {

        problem_10 acc1 = new problem_10("Dharmik", 10000);
        problem_10 acc2 = new problem_10("Rahul", 20000);

        System.out.println("Before updating interest rate:");
        acc1.display();
        acc2.display();

        problem_10.updateInterestRate(7.5);

        System.out.println("After updating interest rate:");
        acc1.display();
        acc2.display();
    }
}
