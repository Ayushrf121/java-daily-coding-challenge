import java.util.Arrays;

public class MinAbsDiffPairs{
    
    
    public static int minSum(int []arr1,int []arr2){
        int sum = 0;
        int abs = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            abs = Math.abs(arr1[i]-arr2[i]);
            sum+=abs;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr1[] = {4,1,8,7};
        int arr2[] = {2,3,6,5};
        System.out.println("The sum of absolute diff. of all pairs : "+minSum(arr1, arr2));
    }
}