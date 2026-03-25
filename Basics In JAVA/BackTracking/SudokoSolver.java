public class SudokoSolver {

    public static boolean isSafe(int sudoko[][],int row,int col,int digit)
    {
        for(int i=0;i<9;i++)
            {
            // col check
            if(sudoko[i][col]== digit)
            {
                return false;
            }
            // row check
            else if(sudoko[row][i] == digit)
            {
                return false;
            }
        }
        // grid check
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sc;j<sc+3;j++)
            {
                if(sudoko[i][j] == digit)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sSolver(int sudoko[][], int row, int col) {
        // base case
        if (row == 9 ) {
            return true;
        }
        // kaam
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextCol = 0;
            nextRow = row + 1;
        }
        // for non zero or non empty col.
        if (sudoko[row][col] != 0) {
            return sSolver(sudoko, nextRow, nextCol);
        }
        for (int d = 1; d <= 9; d++) {
            if (isSafe(sudoko, row, col, d)) {
                sudoko[row][col] = d;
                if (sSolver(sudoko, nextRow, nextCol)) {
                    return true;
                }
                ;
            }
            sudoko[row][col] = 0;
        }
        return false;
    }
    public static void printSol(int sudoko[][])
    {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoko[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoko[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        if(sSolver(sudoko, 0, 0))
        {
            System.out.println("Can be solved");
            printSol(sudoko);
        }else
        {
            System.out.println("Not exist");
        }
    }
}
