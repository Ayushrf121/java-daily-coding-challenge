import java.util.*;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Choice : ");
        int n =sc.nextInt();
        boolean f=false;
        if(n<=1)
        {
            System.out.println(n+" is neither prime nor composite");
        }
        else{
            // for(int i=2;i<n;i++)
            // {
            //     if(n%i==0)
            //     {
            //         f=true;
            //         break;
            //     }
            // }

            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    f=true;
                    break;
                }
            }
            if(!f)
            {
                System.out.println(n+" is Prime");
            }
            else{
                System.out.println(n+" not a prime");
            }
        }

    }
}
