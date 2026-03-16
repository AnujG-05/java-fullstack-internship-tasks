// row:i-> 1 to n     
// col:j-> i to n
// print col number:j

// output:
// 12345
// 2345
// 345
// 45
// 5


package Leftsided;
import java.util.*;
public class I2n {

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n= sc.nextInt();

    //     for(int i=1;i<=n;i++){
    //         for(int j=i;j<=n;j++)
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
            // numbers i..n
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
