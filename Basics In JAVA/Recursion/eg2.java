import java.util.Scanner;

public class eg2 {
    public static void nTo1(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        nTo1(n-1);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         nTo1(n);
    }
}
