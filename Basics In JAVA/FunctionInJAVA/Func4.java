// Check no. is prime or not.

import java.util.Scanner;

public class Func4 {
    public static boolean checkPrime(int n)
    {
        boolean f=true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                f = false;
                break;
            }
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        boolean f=checkPrime(n);
        if(f)
        {
            System.out.println("No. is Prime : "+n);
        }
        else{
            System.out.println("Not the prime : "+n);
        }
        sc.close();
    }
}
