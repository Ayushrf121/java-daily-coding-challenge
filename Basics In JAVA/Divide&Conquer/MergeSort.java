public class MergeSort{
    public static void mergeSort(int arr[],int si,int ei)
    {
        if(si >= ei)
        {
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid+1, ei); // right part
        merge(arr,mid,si,ei);
    }
    public static void merge(int arr[],int mid,int si,int ei)
    {
        int temp [] = new int[ei-si+1];
        int i=si; //left
        int j=mid+1;  //right
        int k=0; //temp arr
        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j])
            {
                temp[k] = arr[i];
                i++;
            }else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left remaining element
            while (i<=mid) {
                temp[k++] = arr[i++];               
            }
        //  right remaining element..
            while (j<=ei) {
                temp[k++] = arr[j++];  
            }
        // copy in original..
        for( k=0,i=si ; k<temp.length;k++,i++)
        {
            arr[i] = temp[k];
        }
        
    }
    public static void main(String[] args) {
        int arr [] = {4,1,3,9,7};
        mergeSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}