// Hollow Rectangle....

import java.util.Scanner;

public class Ap1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int m=sc.nextInt();
        System.out.print("Enter the columns : ");
        int n=sc.nextInt();
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 || j==0 || j==n-1 || i==m-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("\n");
        }
        sc.close();
    }
}