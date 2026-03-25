// Rat in a Maze
// You are given a starting position for a rat which is stuck in a maze at an initial point (0, 0) (the
// maze can be thought of as a 2-dimensional plane). The maze would be given in the form of a
// square matrix of order N * N where the cells with value 0 represent the maze’s blocked
// locations while value 1 is the open/available path that the rat can take to reach its destination.
// The rat's destination is at (N - 1, N - 1).
// Your task is to find all the possible paths that the rat can take to reach from source to
// destination in the maze.
// The possible directions that it can take to move in the maze are 'U'(up) i.e. (x, y- 1) , 'D'(down)
// i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).
public class RatInMaze {

    public static boolean isSafe(int arr[][], int row, int col) {
        if (row < 0 || col < 0 || row >= arr.length || col >= arr.length) {
            return false;
        } else if (arr[row][col] == 0) {
            return false;
        }
        return true;

    }

    public static void freeRat(int arr[][], int srr[][], int row, int col) {
        // base case
        if (row == arr.length - 1 && col == arr.length - 1) {
            print(srr);
            return;
        }
        if (arr[0][0] == 1) {
            srr[0][0] = 1;
        }
        // up
        if (isSafe(arr, row - 1, col)) {
            srr[row - 1][col] = 1;
            arr[row][col] = 0;
            freeRat(arr, srr, row - 1, col);
            arr[row][col] = 1;
            srr[row - 1][col] = 0;
        }
        // down
        if (isSafe(arr, row + 1, col)) {
            srr[row + 1][col] = 1;
            arr[row][col] = 0;
            freeRat(arr, srr, row + 1, col);
            arr[row][col] = 1;
            srr[row + 1][col] = 0;
        }
        // right
        if (isSafe(arr, row, col + 1)) {
            srr[row][col + 1] = 1;
            arr[row][col] = 0;
            freeRat(arr, srr, row, col + 1);
            arr[row][col] = 1;
            srr[row][col + 1] = 0;
        }
        // left
        if (isSafe(arr, row, col - 1)) {
            srr[row][col - 1] = 1;
            arr[row][col] = 0;
            freeRat(arr, srr, row, col - 1);
            arr[row][col] = 1;
            srr[row][col - 1] = 0;
        }
    }

    public static void print(int srr[][]) {
        System.out.println("Path:");
        for (int i = 0; i < srr.length; i++) {
            for (int j = 0; j < srr.length; j++) {
                System.out.print(srr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1}
        };
        int n = arr.length;

        int srr[][] = new int[n][n];
        freeRat(arr, srr, 0, 0);
    }
}