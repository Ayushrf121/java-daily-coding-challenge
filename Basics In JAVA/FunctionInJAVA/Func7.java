// : Write a Java method to compute the average of three numbers..

import java.util.Scanner;

public class Func7 {
    public static float Average(float a,float b,float c )
    {
        float avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter  no.1 : ");
        float a = sc.nextFloat();
        System.out.print("Enter no.2 : ");
        float b = sc.nextFloat();
        System.out.print("Enter no.3 : ");
        float c = sc.nextFloat();
        float avg = Average(a,b,c);
        System.out.println("The average of 3 no. : "+avg);
        sc.close();
    }
}
