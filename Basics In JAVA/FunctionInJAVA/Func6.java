import java.util.Scanner;

public class Func6 {
    public static int binaryTodecimal(int n) {
        int d = 0, p = 0, l = 0;
        if (n <= 111) {
            while (n != 0) {
                l = n % 10;
                d += l * (Math.pow(2, p));
                p++;
                n = n / 10;
            }
        }
        return d;
    }

    public static int DecimalToBinary(int n)
    {
        int b = 0,r=0,pow=0;
        while (n!=0) {
            r = n%2;
            b =b+(r*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary no. : ");
        int n = sc.nextInt();
        int ch;
        do {
            System.err.println("Enter The choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    int d = binaryTodecimal(n);
                    System.out.println("Binary " + n + " Decimal " + d);
                    break;
                case 2:
                    int b= DecimalToBinary(n);
                    System.out.println("Decimal " + n + " Binary " + b);
                default:
                    break;
            }
        } while (ch <= 2);

        sc.close();
    }
}
