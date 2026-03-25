import java.util.Scanner;

public class temp {

    public static int pivotPoint(int arr[],int si,int ei)
    {
        int i=si-1,pivot = arr[ei];
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                arr[i] = arr[i]+arr[j];
                arr[j] = arr[i]-arr[j];
                arr[i] = arr[i]-arr[j];
            }
        }
        i++;
        arr[i] = arr[i]+pivot;
        arr[ei] = arr[i]-arr[ei];
        arr[i] = arr[i]-arr[ei];
        return i;
    }
    
    public static void quickSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pvt = pivotPoint(arr,si,ei);
        quickSort(arr, si, pvt-1);
        quickSort(arr, si, pvt+1);
        return;
    }
    public static void main(String[] args) {
        int arr [] = {9,3,9,4};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
