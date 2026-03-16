import java.util.Scanner;

public class LinearSearch {

    public static int linearSeach(int[] arr, int target){

        if(arr.length==0)
            return -1;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int target = sc.nextInt();
        int[]arr = {19,25,36,2,6,0,12};
        System.out.println(linearSeach(arr, target));
    }
}
