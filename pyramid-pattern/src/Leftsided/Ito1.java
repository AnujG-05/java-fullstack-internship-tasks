// row:i-> n to 1
// col:j-> i to 1
// print col number:j

// output:
// 54321
// 4321
// 321
// 21
// 1


package Leftsided;
import java.util.*;
public class Ito1 {
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     int n=sc.nextInt();

    //     for(int i=n;i>=1;i--){
    //         for(int j=i;j>=1;j--)
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
            // numbers i..1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
