// Floyd Triangle//
import java.util.Scanner;

public class Ap4 {
    public static void Floyd(int n)
    {
        int i,j,k=1;
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int m = sc.nextInt();
        Floyd(m);
        sc.close();
    }
}
