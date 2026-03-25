public class FriendPairProblem {
    public static int friendPair(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }
        return friendPair(n-1) + (n-1)*friendPair(n-2);
    }
    public static void main(String[] args) {
        System.out.println("No. of ways friends can make the pairs : "+friendPair(18));
    }
}
