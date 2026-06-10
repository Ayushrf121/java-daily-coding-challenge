import java.util.Arrays;
import java.util.Comparator;

public class MaxChainLength {
    public static void main(String[] args) {
        //  pairs = [[1,2],[2,3],[3,4]]
        int pairs[][] = {{1,2},{2,3},{3,4}};
        Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));
        int max = 1;
        int lastEnd = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if(lastEnd<pairs[i][0]){
                max++;
                lastEnd = pairs[i][1];
            }
        }
        System.out.println(max);
    }
}
