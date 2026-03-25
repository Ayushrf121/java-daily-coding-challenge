// WAP to find the sum of the diagonal matrix (primary + secondary diagonal)
public class Diagonal {
    public static int DiagonalSum(int[][] arr, int n, int m) {
        int s1 = 0;     
        // TC O(n^2);
        // primary diagonal sum
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (i == j) {
        //             s1 += arr[i][j];
        //             break;
        //         }
        //     }
        // }
        // secondary diagonal sum
        // if ((n * m) % 2 == 0) {
        //     int i = 0, j = m - 1;
        //     while (i < n && j >= 0) {
        //         s2 += arr[i][j];
        //         i++;
        //         j--;
        //     }
        // } else {
        //     int i = 0, j = m - 1;
        //     while (i < n && j >= 0) {
        //         if (i != j) {
        //             s2 += arr[i][j];
        //         }
        //         i++;
        //         j--;
        //     }
        // }

        // TC O(n)
        for (int i = 0; i < n; i++) {
            // pd sum
            s1+=arr[i][i];
            // sd sum
            if(i!=n-i-1)
            {
                s1+=arr[i][n-i-1];
            }
        }
        return s1;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9} };
        int sum = DiagonalSum(arr, arr.length, arr[0].length);
        System.out.println(sum);
    }
}
