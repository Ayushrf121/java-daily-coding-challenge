// Check number is prime in range or not.

import java.util.Scanner;

public class Func5 {
    public static void checkPrime(int x) {
        boolean f = true;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                f = false;
                break;
            }
        }
        if (f) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {

            checkPrime(i);
        }
        sc.close();
    }
}
