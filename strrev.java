import java.util.Scanner;
public class strrev {
    public static void reverseWords(String s) {
    
        String[] words = s.trim().split("\\s+");

        // Print in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  // input string

        // Convert to char array for in-place reversal
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // swap characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // reverse order string 
        reverseWords(s);
        
        // Print reversed string
        System.out.println(new String(arr));

    }   
}