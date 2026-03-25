// Container with most Water 
// TC:- O(n^2);
public class ContainerProblem
{
    public static int maxWater(int []ht,int n)
    {
        int mw = 0,h=0,w=0;
        if(n<=1)
        {
            return mw;
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < ht.length; j++) {
                h = Math.min(ht[i],ht[j]);
                w = j-i; 
                mw = Math.max(mw,h*w);
            }
        }
        return mw;
    }
    public static void main(String[] args) {
        int []ht = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max water it can contain : " + maxWater(ht,ht.length));
    }
}