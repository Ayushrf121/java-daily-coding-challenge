import java.util.Scanner;

public class FibonacciNthSum {
    public static int value(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return value(n-1) + calcNthfibo(n);
    }
    public static int calcNthfibo(int n)
    {
         if(n==0 || n==1)
        {
            return n;
        }
        return calcNthfibo(n-1)+calcNthfibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(value(n));
    }
}
