package task1;
import java.util.Scanner;

public class CircleOperations {

    // Method to calculate area of circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference of circle
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);

        System.out.printf("Area of the circle: %.2f\n", area);
        System.out.printf("Circumference of the circle: %.2f\n", circumference);

        scanner.close();
    }
}
