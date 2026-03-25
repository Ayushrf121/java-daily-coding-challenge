// Write a program to find the factorial of any number entered by the user.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch,facto;
        do {
            facto =1;
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                facto=facto*i; // 1 2 6 24 120
            }
            System.out.println("Factorial of "+n+" "+facto);
            System.out.print("Want to continue : ");
            ch = sc.nextInt();
        } while (ch==1);
    }
}
