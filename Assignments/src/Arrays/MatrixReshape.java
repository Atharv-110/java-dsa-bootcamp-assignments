// Reshape the Matrix
// https://leetcode.com/problems/reshape-the-matrix/
package Arrays;

import java.util.Arrays;

public class MatrixReshape {
    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4}};
        System.out.println(Arrays.toString(matrixReshape(nums,1,4)));
    }

    private static int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int cols = nums[0].length;
        if((rows * cols) != (r * c)) {
            return nums;
        }
        int[][] ans = new int[r][c];
        
        int row_count = 0;
        int col_count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[row_count][col_count] = nums[i][j];
                col_count++;
                if (col_count == c) {
                    col_count = 0;
                    row_count++;
                }
            }
        }
        return ans;
    }
}