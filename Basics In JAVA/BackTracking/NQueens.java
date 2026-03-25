public class NQueens {
    public static void nQueens(char board[][], int row) {
        if (row >= board.length) {
            ans(board, board.length);
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'q';
                nQueens(board, row + 1);
                board[row][i] = '.';
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'q') {
                return false;
            }
        }
        // diagonal left up
        for (int i = row - 1,j = col - 1; i >= 0 && j >= 0; i--,j--) {
                if (board[i][j] == 'q') {
                    return false;
                }
            
        }
        // diagonal right up
        for (int i = row - 1,j = col + 1; i >= 0 && j <board.length; i--,j++) {
                if (board[i][j] == 'q') {
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
        int n = 1;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
    }
}
