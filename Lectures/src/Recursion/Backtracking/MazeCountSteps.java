// Program for: In how many ways or steps we can reach a particular cell in a matrix? (Maze Problem)

package Recursion.Backtracking;

public class MazeCountSteps {
    public static void main(String[] args) {
        System.out.println(countSteps(3, 3));
    }
    
    private static int countSteps(int rows, int cols) {
        if (rows == 1 || cols == 1) {
            return 1;
        }
        int down = countSteps(rows-1, cols);
        int right = countSteps(rows, cols-1);
        
        return down + right;
    }
}
