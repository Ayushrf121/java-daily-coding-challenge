// DSA Ques Medium level
package QuesPracticeArray;

public class TrappingRainwater {
     public static void Display(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
       System.out.println();
    }
    public static int TrapRainWater(int []arr,int width)
    {
        int TrapWater =0,n=arr.length,wl=0;
        int left [] = new int [n];
        left[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            left[i] = Math.max(arr[i],left[i-1]);
        }

        int right [] = new int [n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i] = Math.max(arr[i],right[i+1]);
        }
        for(int i=0;i<n;i++)
        {
            wl = Math.min(left[i], right[i]);
            TrapWater += ((wl-arr[i])*width);
        }
        return TrapWater;
    }
    public static void main(String [] args) {
        // int arr [] = {4,2,0,6,3,2,5};
        // int arr [] = {3,2,0,6,3,2,5};
        int arr [] = {6,5,2,7};
        Display(arr);
        int result=TrapRainWater(arr,1);
        System.out.println("Total water it can store : "+result);
    } 
}
