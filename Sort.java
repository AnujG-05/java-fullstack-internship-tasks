import java.util.*;

public class Sort {

    public static void BubbleSorting(int[] arr, int size)
    {
        boolean swapped;
        for(int i=size-1; i>=1; i--)
        {
            swapped=false;
            for(int j=0; j<i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                    swapped =true;
                }
            }

            if(!swapped) break;
        }
    }


    public static void SelectionSorting(int[] arr)
    {
        int maxIdx;
        for(int i=arr.length - 1; i>=1; i--)
        {
            maxIdx=0;
            for(int j=1; j<=i; j++)
            {
                if(arr[j]>arr[maxIdx])
                    maxIdx=j;
            }

            int temp = arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }

        // BubbleSorting(arr, size);
        SelectionSorting(arr);

        // Method 1
        System.out.println(Arrays.toString(arr));

        // Method 2
        for(int n:arr)
        {
            System.out.print(n + " ");
        }

        System.out.println();
        

        // Method 3

        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
