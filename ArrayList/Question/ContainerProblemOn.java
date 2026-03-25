public class ContainerProblemOn {
    public static int maxWater(int []ht,int n)
    {
        int mw = 0,h=0,w=0,lp,rp;
        lp = 0;
        rp = n-1;

        while (lp<rp) {
            w = rp -lp;
            h = Math.min(ht[lp], ht[rp]); 
            mw = Math.max(mw, h*w);

            // 2 pointer approach.
            if(ht[lp]<ht[rp])
            {
                lp++;
            }else{
                rp--;
            }
        }
        return mw;
    }
    public static void main(String[] args) {
         int []ht = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max water it can contain : " + maxWater(ht,ht.length));
    }
}
