public class Nknight {
    public static void nKnight(char board[][],int row)
    {
        //base
        if(row == board.length)
        {
            ans(board, board.length);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(isSafe(board,row,i))
            {
                board[row][i] = 'K';
                nKnight(board, row+1);
                board[row][i] = 'X';
            }
        } 
    }
    public static boolean isSafe(char board[][],int row,int col)
    {
        // diagonal up left
        for(int i=row-1,j=col-1 ; i>=0 && j>=0 ; i--,j--)
        {
            if(board[i][j] == 'K')
            {
                return false;
            }
        }
        // diagonal up right
        for(int i=row-1,j=col+1 ; i>=0 && j<board.length ; i--,j++)
        {
            if(board[i][j] == 'K')
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
        nKnight(board, 0);
    }
}
