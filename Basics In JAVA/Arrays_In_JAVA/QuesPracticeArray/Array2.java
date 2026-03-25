// Pairs in array
package QuesPracticeArray;

public class Array2 {
    public static void Display(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
       System.out.println();
    }
    public static void PairArray(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1; j < arr.length; j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] ={45,33,21,55,21,7,4};
       Display(arr); 
       PairArray(arr);
    }
}
