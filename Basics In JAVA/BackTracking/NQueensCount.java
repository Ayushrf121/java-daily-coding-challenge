// Count total ways to arrange the queens

public class NQueensCount {
     static int count = 0;
     public static void nQueens(char board[][], int r, int n) {
        // base case
        if (r == n) {
            count++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(board,r,i)) {
                board[r][i] = 'Q';
                nQueens(board, r + 1, n);
                board[r][i] = 'X';
            }
        }
    }
    public static boolean isSafe(char board[][],int r,int c)
    {
        for (int i = r-1; i >=0; i--) {
            if(board[i][c] == 'Q')
            {
                return false;
            }
        }
        for (int i = r-1, j = c-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }
        for (int i = r-1, j = c+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 8;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0, n);
        System.out.println("Total ways to solve N queens problem : "+count);
    }
}
