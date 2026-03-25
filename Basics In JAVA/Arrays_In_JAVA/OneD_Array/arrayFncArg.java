// Passing array as the function arguement.

import java.util.Scanner;

public class arrayFncArg {
    public static void insert(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] =sc.nextInt();
        }
        sc.close();
    }
    public static void main(String[] args) {
        int arr[] = new int[50];
        insert(arr);
        for (int i = 0; i <5; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
