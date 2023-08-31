// WAP to print the path of maze in the form of matrix with indicating steps
// Backtracking Concept
package Recursion.Backtracking;

import java.util.Arrays;

public class MazePrintPathMatrix {

    public static void main(String[] args) {

        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        
//      Step variable will be 1 because we will start the path with 1 not 0
        printMazePath("", maze, 0, 0, path, 1);
    }

    private static void printMazePath(String ans, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
            System.out.println();
            return;
        }

        if (maze[r][c] == false) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

//      4 conditions for all the 4 directions
        if (r < maze.length - 1) {
            printMazePath(ans + "D", maze, r + 1, c, path, step + 1);
        }

        if (c < maze[0].length - 1) {
            printMazePath(ans + "R", maze, r, c + 1, path, step + 1);
        }

        if (r > 0) {
            printMazePath(ans + "U", maze, r - 1, c, path, step + 1);
        }

        if (c > 0) {
            printMazePath(ans + "L", maze, r, c - 1, path, step + 1);
        }
        
//      Backtrack with default changes
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
