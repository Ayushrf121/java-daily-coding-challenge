// keep enter the number till the user enter the number that is multiple of 10.

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while (true) {
            if(n%10==0)
            {
                break;
            }
            else
            {
                System.out.println(n);
                n = sc.nextInt();
            }
        }
    }
}
