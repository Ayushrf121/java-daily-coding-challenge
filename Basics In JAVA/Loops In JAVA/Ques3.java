//Write a program that reads a set of integers, and then prints the sum of the 
// even and odd integers. 

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ch;
        int e=0,o=0;
        do {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            if(n%2==0)
            {
                e+=n;
            }
            else{
                o+=n;
            }
            System.out.print("Want to continue : ");
            ch = sc.nextInt();
        } while (ch==1);
        System.out.println("Even: "+e+" Odd:"+o);
    }
}
