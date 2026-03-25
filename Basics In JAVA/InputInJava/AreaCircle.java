package InputInJava;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.1415f;
        float r =sc.nextFloat();
        System.out.println(pi*r*r);
        sc.close();
    }
}
