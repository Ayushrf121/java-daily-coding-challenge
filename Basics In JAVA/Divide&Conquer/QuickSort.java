public class QuickSort {
    public static int pivotIndex(int arr[],int l,int r)
    {
        int i=l-1 , pivot = arr[r],t=0;
        for(int j=l ; j<r ; j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                // swap
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        i++;
        t = arr[i];
        arr[i] = pivot;
        arr[r] = t;
        return i;
    }
    public static void quickSort(int arr[], int l ,int r)
    {
        // base
        if(l>=r)
        {
            return;
        }   
        int pidx = pivotIndex(arr,l,r);
        quickSort(arr, l, pidx-1);
        quickSort(arr, pidx+1, r);
    }
    public static void main(String[] args) {
        int arr [] = {9,3,9,4};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
