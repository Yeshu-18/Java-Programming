import java.util.Scanner;
public class Sum_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Sum: " + sum);
        scanner.close();
}
}
