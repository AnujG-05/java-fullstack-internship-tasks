package task1;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
            sum += num;
        }

        System.out.println("\nSum of array elements: " + sum);
        scanner.close();
    }
}
