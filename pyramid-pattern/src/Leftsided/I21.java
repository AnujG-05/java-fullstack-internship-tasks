// row:i-> 1 to n   
// col:j-> i to 1
// print col number:j

// output:
// 1
// 21
// 321
// 4321
// 54321


package Leftsided;
import java.util.*;
public class I21 {
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     int n=sc.nextInt();

    //     for(int i=1;i<=n;i++){
    //         for(int j=i;j>=1;j--)
    //             System.out.print(j);

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
            // numbers i..1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
