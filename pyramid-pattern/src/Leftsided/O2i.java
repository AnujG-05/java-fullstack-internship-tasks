// row:i-> 1 to n      
// col:j-> 1 to i
// print col number:j

// output:
// 1
// 12
// 123
// 1234
// 12345


package Leftsided;
import java.util.*;
public class O2i {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++)
    //             System.err.print(j);

    //     System.out.println();
    //     }
    // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // numbers 1..i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
