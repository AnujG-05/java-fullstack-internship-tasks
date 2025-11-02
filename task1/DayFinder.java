package task1;
import java.util.Scanner;

public class DayFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to find the corresponding day: ");
        int dayNumber = scanner.nextInt();

        String day;
        switch (dayNumber) {
            case 1: day = "Sunday"; break;
            case 2: day = "Monday"; break;
            case 3: day = "Tuesday"; break;
            case 4: day = "Wednesday"; break;
            case 5: day = "Thursday"; break;
            case 6: day = "Friday"; break;
            case 7: day = "Saturday"; break;
            default: day = "Invalid day number! Please enter 1 to 7.";
        }

        System.out.println(day);
        scanner.close();
    }
}
