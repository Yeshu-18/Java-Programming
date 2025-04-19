import java.util.Scanner;

public class ATM {
    private static double balance = 5000.0;

    public static void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new ArithmeticException("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Transaction Successful! New balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            withdraw(amount);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid amount.");
        } finally {
            System.out.println("Transaction Completed.");
        }

        scanner.close();
    }
}