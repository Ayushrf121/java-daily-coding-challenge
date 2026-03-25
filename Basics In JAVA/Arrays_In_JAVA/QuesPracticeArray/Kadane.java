package QuesPracticeArray;
import java.util.*;
public class Kadane {

     public static void Display(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
       System.out.println();
    }
    public static void KadaneAlgo(int []arr)
    {
        int currentValue = 0,max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            // currentValue+=arr[i];
            // if(currentValue<0)
            // {
            //     currentValue = 0;
            // }
            // to handle the sp. case
            currentValue = Math.max(arr[i],currentValue+arr[i]);
            max = Math.max(max,currentValue);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        // int arr[] ={-2,-3,-1,-7,-5};
        int arr[] ={-2,-3,4,-1,-2,1,5};
       Display(arr); 
       KadaneAlgo(arr);   

    }
 
}
