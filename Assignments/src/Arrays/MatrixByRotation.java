// Determine Whether Matrix Can Be Obtained By Rotation
// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
package Arrays;

public class MatrixByRotation {
    
    public static void main(String[] args) {
        int[][] mat = {{0,1}, {1,0}};
        int[][] target = {{1,0}, {0,1}};
        System.out.println(findRotation(mat, target));    
    }

    private static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (check(mat, target)) {
                return true;
            }
            rotate(mat);
        }
        
        return false;
    }

    private static boolean check(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void rotate(int[][] mat) {
        int n = mat.length;
        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // Flipping the matrix
        int start = 0;
        int end = mat.length - 1;
        while (start <= end) {            
            for (int row = 0; row < mat.length; row++) {
               int temp = mat[row][start];
               mat[row][start] = mat[row][end];
               mat[row][end] = temp;
            }
            start++;
            end--;
        }
    }
    
}
