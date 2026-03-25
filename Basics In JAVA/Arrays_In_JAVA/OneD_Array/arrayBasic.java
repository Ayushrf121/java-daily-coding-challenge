public class arrayBasic{

    public static void main(String[] args) {
        // Array of size 50 created.    
        int arr[] = new int[50];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = 45;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        float brr[] = {4.5f,4,7.8f,77.6f};
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }

    }
}