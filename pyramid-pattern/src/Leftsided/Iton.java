// row:i-> n to 1 
// col:j-> i to n
// print col number:j

// output:
// 5
// 45
// 345
// 2345
// 12345



package Leftsided;
import java.util.*;

public class Iton {
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     int n=sc.nextInt();

    //     for(int i=n;i>=1;i--){
    //         for(int j=i;j<=n;j++)
    //             System.out.print(j);

    //     System.out.println();
    //     }
    // }


     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            // spaces
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            // numbers i..n
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}