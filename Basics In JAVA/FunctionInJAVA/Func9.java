// Write a Java program to check if a number is a palindrome in Java? ( 121 is 
// a palindrome, 321 is not)

import java.util.Scanner;

public class Func9 {
    public static boolean isPalindrome(int x)
    {
        int t=x,r=0,l=0;
        while (t!=0) {
            l=t%10;
            r=r*10+l;
            t=t/10;
        }
        if(r==x)
        {
            return true;
        }
        return false;

    }
    public static void main(String []args)
    {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. : ");
        int x = sc.nextInt();
        boolean f = isPalindrome(x);
        System.out.println(f);
        sc.close();
    }
}
