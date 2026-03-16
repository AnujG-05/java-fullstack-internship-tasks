// row:i-> 1 to n     
// col:j-> n to i
// print col number:j

// output:
// 54321
// 5432
// 543
// 54
// 5


package Leftsided;
import java.util.*;
public class N2i {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n= sc.nextInt();

    //     for(int i=1;i<=n;i++){
    //         for(int j=n;j>=i;j--)
    //             System.out.print(j);

    //     System.out.println();
    //     }
    // }


     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            // numbers n..i
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
