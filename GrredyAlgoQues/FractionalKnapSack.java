import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {
    public static int knapSack(int[]wt,int[]value,int w){
        int ans=0;
        double res[][] = new double[value.length][2];
        for (int i = 0; i < res.length; i++) {
            res[i][0] = i;
            res[i][1] = value[i]/(double)wt[i];
        }
        Arrays.sort(res,Comparator.comparingDouble(o->o[1]));
        for (int i = res.length-1; i>=0; i--) {
            int idx = (int)res[i][0];
            if(w>=wt[idx]){
                ans+=value[idx];
                w-=wt[idx];
            }else{
                // fractional part of wt
                ans+=(int)(res[i][1]*w);
                w=0;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []wt={10,30,20};
        int []value={60,100,120};
        System.out.println(knapSack(wt, value, 50));
    }
}
