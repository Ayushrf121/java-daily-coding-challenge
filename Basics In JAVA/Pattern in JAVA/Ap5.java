import java.util.Scanner;

public class Ap5 {
    public static void ZeroOne(int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1+" ");
                }
                else{System.out.print(0+" ");}
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int m = sc.nextInt();
        ZeroOne(m);
        sc.close();
    }
}
