import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to ATM: ");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");

        int choice = sc.nextInt();

        switch (choice) {   
            case 1:
                System.out.println("Check Balnce");
                break;
            case 2:
                System.out.println("Withdraw Money");
                break;
            case 3:
                System.out.println("Deposit Money");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}