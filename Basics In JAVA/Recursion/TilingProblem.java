import java.util.Scanner;

public class TilingProblem {
    public static int nOW(int m, int n)
    {
        // base
        if(n==0 || n==1)
        {
            return 1;
        }
        return nOW(m, n-1)+nOW(m, n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 2;
        int n = sc.nextInt();
        System.out.println("No. of ways to arrange the tile : "+nOW(m,n));
    }
}
