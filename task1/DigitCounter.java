package task1;
import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        int temp = Math.abs(number); // handle negative numbers
        if (temp == 0) { // If number is 0, it has 1 digit
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }

        System.out.println("Number of digits in " + number + " is: " + count);
        scanner.close();
    }
}
