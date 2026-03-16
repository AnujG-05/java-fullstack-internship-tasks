// row:i-> n to 1    
// col:j-> n to i
// print col number:j

// output:
// 5
// 54
// 543
// 5432
// 54321


package Leftsided;
import java.util.*;
public class Ntoi {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     for(int i=n;i>=1;i--){
    //         for(int j=n;j>=i;j--)
    //             System.err.print(j);

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
            // numbers n..i
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
