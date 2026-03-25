// Write a method named isEven that accepts an int argument. The method 
// should return true if the argument is even, or false otherwise. Also write a program to test 
// your method. 

import java.util.Scanner;

public class Func8 {
    public static boolean isEven(int x)
    {
        if(x%2==0)
        {
            return true;
        }   
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. : ");
        int x = sc.nextInt();
        boolean f = isEven(x);
        System.out.println(f);
        sc.close();
    }
}
