// Matrix Diagonal Sum
// https://leetcode.com/problems/matrix-diagonal-sum/
package Arrays;

public class DiagonalMatrixSum {
    public static void main(String[] args) {
        int[][] mat = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9},
                      };
        System.out.println(diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat) {
        int n = mat.length, ans = 0;
        for (int i = 0; i < n; i++) {
            ans += mat[i][i] + mat[i][n - i - 1];
        }
        if (n % 2 != 0) {
            ans -= mat[n/2][n/2];
        }
        return ans;
    }
}
