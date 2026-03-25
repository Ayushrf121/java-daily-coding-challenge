package Math_Function;

import java.util.Scanner;

public class MathFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. : ");
        int x = sc.nextInt();
        System.out.print("Enter the No. : ");
        int y = sc.nextInt();
        // Min of two value.
        System.out.println(Math.min(x,y));
        // Max of two value.
        System.out.println(Math.max(x,y));
        // square root of value.
        System.out.println(Math.sqrt(x));
        // absolute +ve.
        System.out.println(Math.abs(y));
        // x to power y.
        System.out.println(Math.pow(x, y));
        System.out.print("Enter the float No. : ");
        float z = sc.nextFloat();
        // round off
        System.out.println(Math.round(z));
        // rounded to up
        System.out.println(Math.ceil(z)); 
        // rounded to down.
        System.out.println(Math.floor(z)); 
    }
}
