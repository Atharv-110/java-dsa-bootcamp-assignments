// Leetcode 59: Spiral Matrix II
// https://leetcode.com/problems/spiral-matrix-ii/

package Arrays.Medium;

import java.util.Arrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 3;
        
        int[][] matrix = generateMatrix(n);
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ "\t");
            }
            System.out.println();
        }
    }

    private static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1, l = 0, r = n - 1, t = 0, b = n - 1, d = 0;
        
        while (l <= r && t <= b) {            
            if (d == 0) {
                for (int i = l; i <= r; i++) {
                    matrix[t][i] = num;
                    num++;
                }
                t++;
                d = 1;
            } else if (d == 1) {
                for (int i = t; i <= b; i++) {
                    matrix[i][r] = num;
                    num++;
                }
                r--;
                d = 2;
            } else if (d == 2) {
                for (int i = r; i >= l; i--) {
                    matrix[b][i] = num;
                    num++;
                }
                b--;
                d = 3;
            } else if (d == 3) {
                for (int i = b; i >= t; i--) {
                    matrix[i][l] = num;
                    num++;
                }
                l++;
                d = 0;
            }
        }
        return matrix;
    }
}
