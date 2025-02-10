import java.util.Scanner;

class TypeCastingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for USD amount
        System.out.print("Enter amount in USD: ");
        double usd = scanner.nextDouble();

        // Convert USD to INR 
        double exchangeRate = 83.00;
        double inrAmount = usd * exchangeRate;

        // Explicit narrowing conversion (double to int)
        int roundedInr = (int) inrAmount;

        // Display INR values
        System.out.println("Converted amount in INR (double): " + inrAmount);
        System.out.println("Converted amount in INR (rounded int): " + roundedInr);

        // Additional Type Conversion Examples
        byte smallNumber = 121;
        int mediumNumber = smallNumber; // Implicit widening (byte → int)
        double largeNumber = mediumNumber; // Implicit widening (int → double)
        
        System.out.println("Widening: byte to int: " + mediumNumber);
        System.out.println("Widening: int to double: " + largeNumber);

        double anotherDouble = 99.99;
        int anotherInt = (int) anotherDouble; // Explicit narrowing (double → int)
        byte anotherByte = (byte) anotherInt; // Explicit narrowing (int → byte)

        System.out.println("Narrowing: double to int: " + anotherInt);
        System.out.println("Narrowing: int to byte: " + anotherByte);

        scanner.close();
    }
}
