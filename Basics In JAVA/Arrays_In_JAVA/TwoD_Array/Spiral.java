import java.util.Scanner;

public class Spiral {
    public static void Matrix(int [][]arr)
    {
        int n = arr.length, m = arr[0].length; 
        int sr = 0, er = n - 1, sc = 0, ec = m - 1;

        while (sr <= er && sc <= ec) {
            // Top row
            for (int i = sc; i <= ec; i++) {
                System.out.print(arr[sr][i] + " ");
            }

            // Right column
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(arr[i][ec] + " ");
            }

            // Bottom row (only if more than one row)
            if (sr != er) {
                for (int i = ec - 1; i >= sc; i--) {
                    System.out.print(arr[er][i] + " ");
                }
            }

            // Left column (only if more than one column)
            if (sc != ec) {
                for (int i = er - 1; i >= sr + 1; i--) {
                    System.out.print(arr[i][sc] + " ");
                }
            }

            sr++;
            sc++;
            er--;
            ec--;
        }
    }

    public static void main(String[] args) {
        int [][]arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSpiral order:");
        Matrix(arr);
        sc.close();
    }
}
