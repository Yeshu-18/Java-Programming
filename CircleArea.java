import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
        scanner.close();
    }
}
