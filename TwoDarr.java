public class TwoDarr{
    static void calculation(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++){
            System.out.println(arr[i]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={ {1,5},{7,3},{3,5}};
        calculation(arr);
        // System.out.println(Arrays.toString(arr));
    }
}