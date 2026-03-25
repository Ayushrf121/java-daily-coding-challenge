public class SortedArrayIterative {
    public static int searchValue(int arr[],int l,int h,int tar)
    {   
        int m=0;
        while (l<=h) {
            m = l + (h-l)/2;
            if(tar == arr[m])
            {
                return m;
            }
            if(arr[l]<=arr[m])
            {
                if(tar<arr[m] && tar>=arr[l])
                {
                    h=m-1;  
                }
                else
                {
                    l=m+1;
                }
            }else
            {
                if(tar<=arr[h] && tar>arr[m])
                {
                    l = m+1;
                }else
                {
                    h = m-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 16;
        int position = searchValue(arr,0,arr.length-1,tar);  
        System.out.println(position);
    }
    
}