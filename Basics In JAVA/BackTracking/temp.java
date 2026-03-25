public class temp {
    public static void nQueens(char board[][], int r, int n) {
        // base case
        if (r == n) {
            ans(board, n);
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

    public static void ans(char board[][], int n) {
        System.out.println("-------------Chess Board-----------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0, n);
    }
}