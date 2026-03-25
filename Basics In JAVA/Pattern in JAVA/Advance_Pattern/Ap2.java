// Inverted half pyramid
import java.util.Scanner;

public class Ap2 {
    public static void InvertedLeft(int r)
    {
        int i, j,k;
        for(i=0;i<r;i++)
        {
            // spaces__
            for(k=0;k<r-i-1;k++)
            {
                System.out.print("  ");
            }
            // stars
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
    public static void InvertedRight(int r)
    {
        int i, j;
        for(i=0;i<r;i++)
        {
            // stars
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int m = sc.nextInt();
        InvertedLeft(m);
        InvertedRight(m);
        

        sc.close();
    }
}
