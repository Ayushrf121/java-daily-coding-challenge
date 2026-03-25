public class temp {
    public static int  noOfWays(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }
        return noOfWays(n-1)+(n-1)*noOfWays(n-2);
    }
    public static void main(String[] args) {
       int n = 3;
       System.out.println(noOfWays(n));
    }    
}
