// TO reverse an array
package QuesPracticeArray;

public class Array1 {
    public static void ReverseArray(int []arr)
    {
        for(int i=0;i<=(arr.length)/2;i++)
        {
            int t = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = t;
        }
    }
    public static void Display(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
       System.out.println();
    }
    public static void main(String []args)
    {
       int arr[] ={45,33,21,55,21,7,4};
       Display(arr); 
       ReverseArray(arr);
       Display(arr);
    }
}
