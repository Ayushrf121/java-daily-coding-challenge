// WAP to find soln for the x^y.

import java.util.Scanner;
import java.util.concurrent.RecursiveAction;

public class Binary_Exponentiation {
    public static int RecursiveApproach(int x,int y)
    {
        if(y==0)
        {
            return 1;
        }
        int h = RecursiveApproach(x, y/2);
        int ans = h * h;
        if(y%2==1)
        {
            ans = ans * x;
        }
        return ans;
    }
    public static int IterativeApproach(int x,int y)
    {
        int ans=1;
        while (y>0) {
            // set bit check if 1 then works
            if((y&1)!=0)
            {
                ans = ans * x;
            }
            x = x*x;
            y = y>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt(); 
        y = sc.nextInt(); 
        System.out.println(RecursiveApproach(x,y));
        System.out.println(IterativeApproach(x,y));
    }
}
