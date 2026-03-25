// Subarray in java.... n((n+1)/2)
package QuesPracticeArray;

public class Array3 {
    public static void Display(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
       System.out.println();
    }
    public static void SubArray(int []arr)
    {
      int ts=0;  
      for(int i=0;i<arr.length;i++)
      {
          for(int j=i;j<arr.length;j++)
          {
            int sum =0;
            for(int k=i;k<=j;k++)
            {
                System.out.print(arr[k]+" ");
                sum+=arr[k];
            }
            ts++;
            System.out.println();
            System.out.println("Total sum of subArray : "+sum);
        }
        System.out.println();
      }
      System.out.println("Total SubArray: "+ts);   
    }
    public static void main(String[] args) {
       int arr[] ={-2,-3,1,7,-5};
       Display(arr); 
       SubArray(arr);
    }
}
