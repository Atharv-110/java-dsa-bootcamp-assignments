// WAP to move in all four direction in a maze
// Backtracking concept

package Recursion.Backtracking;

public class MazeAllDirections {

    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        moveAllDirections("", maze, 0, 0);
    }

    private static void moveAllDirections(String ans, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }
        if (maze[r][c] == false) {
            return;
        }

        maze[r][c] = false;

//      Now 4 conditions for moving in all the 4 directions that are Up, Down, Right & Left

//      To move down from (0,0) we will row+1 and col as it is
        if (r < maze.length - 1) {
            moveAllDirections(ans + "D", maze, r + 1, c);
        }

//      To move right from (0,0) we will col+1 and row as it is
        if (c < maze[0].length - 1) {
            moveAllDirections(ans + "R", maze, r, c + 1);
        }

//      To move Up from any point greater than (0,c) we will do row-1 and col as it is
        if (r > 0) {
            moveAllDirections(ans + "U", maze, r - 1, c);
        }

//      To move Left from any point greater than (r,0) we will do col - 1 and row as it is
        if (c > 0) {
            moveAllDirections(ans + "L", maze, r, c - 1);
        }

//      We will backtrack to prev changes we did for the present recursive call
//      So for future recursive calls we will make all the changes as they were in starting
        maze[r][c] = true;

    }
}
