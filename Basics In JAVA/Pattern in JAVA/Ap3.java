// Inverted Half pyramid...
import java.util.Scanner;

public class Ap3 {
    public static void InvertedBottom(int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int m = sc.nextInt();
        // System.out.print("Enter the columns : ");
        // int n = sc.nextInt();
        InvertedBottom(m);
        sc.close();
    }
}
