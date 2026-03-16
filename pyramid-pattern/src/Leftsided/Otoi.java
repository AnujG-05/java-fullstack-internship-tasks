// row:i-> n to 1      
// col:j-> 1 to i
// print col number:j

// output:
// 12345
// 1234
// 123
// 12
// 1

package Leftsided;
import java.util.*;
public class Otoi {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n= sc.nextInt();

    //     for(int i=n;i>=1;i--){
    //         for(int j=1;j<=i;j++)
    //             System.out.print(j);

    //     System.out.println();
    //     }
    // }


     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
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
 