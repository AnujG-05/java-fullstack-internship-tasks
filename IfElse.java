import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();

        if(a>=18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }
    }
}
