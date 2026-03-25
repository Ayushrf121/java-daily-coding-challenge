import java.util.*;
public class LargestElement {
    public static int FindLargest(int arr[])
    {
        // A constant holding the minimum value an int can have, -231.
        int l = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(l<arr[i])
            {
                l=arr[i];
            }
        }
        return l;
    }
     public static int FindSmallest(int arr[])
    {
        int s = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(s>arr[i])
            {
                s=arr[i];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[] = {45,43,65,7,21,54};
        // Find the largest one...
        // A constant holding the maximum value an int can have, 231-1.
        // int l = Integer.MAX_VALUE;
        int l= FindLargest(arr);
        System.out.println("Largest among the array: "+l);
        int s= FindSmallest(arr);
        System.out.println("Smallest among the array: "+s);
    }
}
