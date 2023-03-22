// Lucky Numbers in a Matrix
// https://leetcode.com/problems/lucky-numbers-in-a-matrix/
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class luckyNumInMatrix {
    public static void main(String[] args) {
        int[][] mat = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(mat));
    }

    private static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minIndex = 0;
            int minValue = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minValue) {
                    minIndex = j;
                    minValue = matrix[i][j];
                }
            }
            boolean isTrue = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][minIndex] < matrix[j][minIndex]) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                arr.add(matrix[i][minIndex]);
            }
        }
        return arr;
    }
}
