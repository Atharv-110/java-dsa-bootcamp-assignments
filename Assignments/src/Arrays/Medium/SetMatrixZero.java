// Leetcode 73: Set matrix zero
// https://leetcode.com/problems/set-matrix-zeroes/

package Arrays.Medium;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };
        
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void setZeroes(int[][] matrix) {
        int flag = 1;
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                flag = 0;
            }
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        
        for (int i = rows-1; i >= 0; i--) {
            for (int j = cols-1; j >= 1; j--) {
                if (matrix[i][0]==0 || matrix[0][j]==0) {
                    matrix[i][j] = 0;
                }
            }
            if (flag == 0) {
                matrix[i][0] = 0;
            }
        }
    }
}
