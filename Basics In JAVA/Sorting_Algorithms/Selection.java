public class Selection {
    public static void Sort(int []arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min = j;
                }
            }
            int t=arr[min];
            arr[min] = arr[i]; 
            arr[i] = t;
        }
    }
    public static void main(String[] args) {
         int arr[] ={5,4,1,3,2};
       Sort(arr);
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       }
    }
}
