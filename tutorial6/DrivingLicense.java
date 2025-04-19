import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class DrivingLicense {
    public static void checkEligibility(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Applicant is under 18. Registration denied.");
        }
        System.out.println("Registration successful!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter applicant's age: ");
            int age = scanner.nextInt();
            checkEligibility(age);
        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid age.");
        } finally {
            System.out.println("Process Completed.");
        }

        scanner.close();
    }
}