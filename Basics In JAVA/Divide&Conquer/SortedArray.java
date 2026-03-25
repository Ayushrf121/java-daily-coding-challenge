// given a sorted array now it is rotated where now we have to the position where the targeted value located..

public class SortedArray {
    public static int searchValue(int arr[],int l,int h,int tar)
    {
        // base case
        if(l>h)
        {return -1;}    
        int mid = l + (h-l)/2;
        if(tar == arr[mid])
        {
            return mid;
        }
        if(arr[l]<arr[mid])
        {
            if(tar<=arr[mid] && tar>=arr[l])
            {
                return searchValue(arr, l, mid-1, tar);
            }
            else
            {
                return searchValue(arr, mid+1, h, tar);
            }
        }else
        {
            if(tar<=arr[h] && tar>=arr[mid])
            {
                return searchValue(arr, mid+1, h, tar);
            }
            else
            {
                return searchValue(arr, l, mid-1, tar);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 6;
        int position = searchValue(arr,0,arr.length-1,tar);  
        System.out.println(position);
    }
}
