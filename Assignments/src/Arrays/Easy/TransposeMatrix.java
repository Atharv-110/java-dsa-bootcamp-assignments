// Transpose of Matrix
// https://leetcode.com/problems/transpose-matrix/
package Arrays;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] trans = transposeMatrix(matrix);
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[i].length; j++) {
                System.out.print(trans[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] transposeMatrix(int[][] matrix) {
        int col_len = matrix[0].length;
        int row_len = matrix.length;
        int[][] ans = new int[col_len][row_len];
        for (int i = 0; i < row_len; i++) {
            for (int j = 0; j < col_len; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
