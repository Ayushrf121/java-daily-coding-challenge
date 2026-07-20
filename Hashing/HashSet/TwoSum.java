import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum{
    public static List<Integer> getTwoSum(int []arr,int k){
        List<Integer> li = new ArrayList<>();
        if(arr.length<=1){
            return li;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(k-arr[i])){
                li.add(map.get(k-arr[i]));
                li.add(i);
                break;
            }else{
                map.put(arr[i], i);
            }
        }
        return li;
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int k = 9;
        System.out.println(getTwoSum(arr,k));
    }
}