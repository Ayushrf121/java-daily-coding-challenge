// TC : O(n^2); for unsorted and sorted array 
public class Bubble {
    public static void Sort(int []arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
    public static void main(String[] args) {
       int arr[] ={5,4,1,3,2};
       Sort(arr);
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       }
    }
}
