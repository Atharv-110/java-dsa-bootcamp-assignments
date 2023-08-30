// Write a program to reach a cell while excluding obstacles in between
package Recursion.Backtracking;

public class MazeWithObstacles {

    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        pathWithObstacles("", maze, 0, 0);
    }

    private static void pathWithObstacles(String ans, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }

        if (maze[r][c] == false) {
            return;
        }

        if (r < maze.length - 1) {
            pathWithObstacles(ans + "D", maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            pathWithObstacles(ans + "R", maze, r, c + 1);
        }

    }
}
