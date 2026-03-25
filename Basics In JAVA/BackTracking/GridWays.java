// Count total ways to reach at the n-1,m-1 from 0,0 .
// Allowed Moves : right and down...

public class GridWays {
    static int ways = 0;
    public static int gridWays(int i,int j,int n,int m)
    {
        // base case
        // itself reaching way = 1
        if(i==n-1 && j==m-1)
        {
            return 1;
        }else if(i==n || j==m)
        {
            return 0;
        }

        int w1 = gridWays(i, j+1, n, m);
        int w2 = gridWays(i+1, j, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n = 3,m=3;
        System.out.println("Total ways to reach n,m : "+gridWays(0,0,n,m));
    }
}
