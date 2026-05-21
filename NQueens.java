import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[i].length;j++){
                board[i][j] = '.';
            }
        }

        List<List<String>> res = new ArrayList<>();
        solve(board, 0, res, n);
        return res;

    }

    public static boolean solve(char[][] board, int rowidx, List<List<String>> res, int n){
        // if n queens placed in board 
        if(rowidx == n){
            res.add(combine(board));
            return true;
        }

        for(int i = 0;i < board.length;i++){
            if(board[rowidx][i] == '.'){
                if(isvalid(board, rowidx, i)){
                    board[rowidx][i] = 'Q';

                    solve(board, rowidx + 1, res, n);
                    // backtrack
                    board[rowidx][i] = '.';
                }
            }
            // return false;
        }

        return true;
    }

    public static boolean isvalid(char[][] board, int row, int col){
        // checking for columns
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q') return false;
        }

        // checking \ diagonal
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q') return false;
        }

        // checking / diagonal
        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }

    public static List<String> combine(char[][] board){
        List<String> list = new ArrayList<>();

        for(char[] ch : board){
            String s = new String(ch);
            list.add(s);
        }

        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of Queens: ");
        int n = sc.nextInt();

        List<List<String>> res = new ArrayList<>(solveNQueens(n));

        for(List<String> list : res){
            System.out.println(list);
        }
    }
}