import java.util.*;

public class Sudoku {

    public static void solveSudoku(char[][] board) {
        solve(board);
    }

    public static boolean solve(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                // checking empty cell
                if (board[i][j] == '.') {

                    for (char ch = '1'; ch <= '9'; ch++) {

                        if (isvalid(board, i, j, ch)) {

                            board[i][j] = ch;

                            // recursive call
                            if (solve(board))
                                return true;
                            else
                                board[i][j] = '.'; // backtracking
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isvalid(char[][] board, int row, int col, char num) {

        // check row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num)
                return false;
        }

        // check column
        for (int j = 0; j < board.length; j++) {
            if (board[j][col] == num)
                return false;
        }

        // check 3x3 matrix
        int rowidx = row - (row % 3);
        int colidx = col - (col % 3);

        for (int i = rowidx; i <= rowidx + 2; i++) {
            for (int j = colidx; j <= colidx + 2; j++) {

                if (board[i][j] == num)
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        solveSudoku(board);

        // printing solved board
        for (char[] row : board) {

            for (char ch : row) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}