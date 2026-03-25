
// Find the index where the value is present....
import java.util.Scanner;

public class LinearSearch {
    public static void insert(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values:-");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int find(int arr[], int val) {
        for (int i = 0; i < 5; i++) {
            if (val == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[50];
        insert(arr);
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        int index = find(arr, val);
        if (index != -1) {
            System.out.println("Found at index : " + index);
        }
        sc.close();
    }
}
