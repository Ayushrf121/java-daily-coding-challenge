public class temp
{
    public static void sortArr(int arr[],int si,int ei) {
        if(si>=ei)
        {
            return;
        }
        int pidx = pivotIndex(arr,si,ei);
        sortArr(arr, si, pidx-1);
        sortArr(arr, pidx + 1, ei);
        
    }
    public static int pivotIndex(int arr[],int si,int ei)
    {
       int pivot = arr[ei],i=si-1;
       for(int j=si ; j<ei ; j++)
       {
            if(arr[j]<pivot)
            {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
       }
       i++;
       int t = arr[i];
       arr[i] = pivot;
       arr[ei] = t;
       return i;
    }
    public static void main(String[] args) {
        int arr [] = {4,1,3,9,7};
        sortArr(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}