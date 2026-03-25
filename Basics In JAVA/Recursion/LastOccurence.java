public class LastOccurence {
    public static int lastOccurence(int arr[],int i,int x)
    {
        if(i<0)
        {
            return -1;
        }
        if(x==arr[i])
        {
            return i;
        }
        return lastOccurence(arr, i-1, x);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,7,3,4,5,3,4,5};
        System.out.println(lastOccurence(arr,arr.length-1,4));
    }
}
