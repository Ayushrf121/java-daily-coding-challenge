import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainPairs {
    public static int maxChain(int [][]arr){
        Arrays.sort(arr,Comparator.comparingInt(o->o[1]));
        int maxVal = 1;
        int l_end = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if(l_end<arr[i][0]){
                maxVal++;
                l_end = arr[i][1];
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {5,24},{39,60},{5,28},{27,40},{50,90}
        };
        System.out.println("The maximum length of the chain will be : "+maxChain(arr));
    }
}