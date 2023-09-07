// Place N queens on N*N chess board (matrix) and none of queen should collide with each other
package Recursion.Backtracking;

import java.util.Scanner;

public class NQueens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Value of N: ");
        int N = sc.nextInt();
        boolean[][] board = new boolean[N][N];
//      We will pass 0 at row because it will get increased with each recursive call and will stop when the base condition hits
        System.out.println(placeQueen(board, 0));

    }

    private static int placeQueen(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += placeQueen(board, row + 1);
//              backtrack the current change
                board[row][col] = false;
            }
        }

        return count;
    }

//  Printing of Board will be done in this function
    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
//      Check for vertical row upside
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

//      Check for the left diagonal
//      maxLeft will have the maximum length till we can check in left diagonal 
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

//      Check for the right diagoal
//      maxRight will have the maximum length till we can check in right diagonal
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

//      if all the checks passed from above then it will be safe to place the queen over there
        return true;
    }
}
