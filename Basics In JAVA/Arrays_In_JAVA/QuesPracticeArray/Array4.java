//  Subarray sum 
package QuesPracticeArray;

public class Array4 {
     public static void Display(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
       System.out.println();
    }
    public static void MaxSubArraySum(int []arr)
    {
      int max=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++)
      {
        for(int j=i;j<arr.length;j++)
        {
          int s =0;
          for(int k=i;k<=j;k++)
          {
            System.out.print(arr[k]+" ");
            s+=arr[k];
          }
          System.out.println();
          System.out.println("The sum of subarray: "+s);
          if(s>max)
          {
            max = s;
          }
        }
        System.out.println();
      }
      System.out.println(max);

      
    }
    public static void main(String[] args) {
         int arr[] ={-2,-3,-4,-1,-2,-9,-5};
       Display(arr); 
       MaxSubArraySum(arr);
    }
}
