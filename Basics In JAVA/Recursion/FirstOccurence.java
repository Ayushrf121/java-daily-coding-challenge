public class FirstOccurence {
    public static int firstOccurence(int arr[],int i,int x)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(x==arr[i])
        {
            return i;
        }
        return firstOccurence(arr, i+1, x);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,7,3,4,5,3,4,5};
        System.out.println(firstOccurence(arr,0,4));
    }
}
