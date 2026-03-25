import java.util.Scanner;

public class Ap6 {
    public static void Butterfly(int n)
    {
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            // stars...
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            // spaces
            for(k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
            // stars..
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--)
        {
            // stars...
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            // spaces
            for(k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
            // stars..
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int m = sc.nextInt();
        Butterfly(m);
        sc.close();
    }
}
