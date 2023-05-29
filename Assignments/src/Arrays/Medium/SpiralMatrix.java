// Leetcode 54: Spiral Matrix
// https://leetcode.com/problems/spiral-matrix/
package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        System.out.println(spiralOrder(matrix));
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        List<Integer> list = new ArrayList();        
        
        if (rows==0) {
            return list;
        }
        
        int left = 0, right = cols-1, top = 0, btm = rows-1, d = 0;
        
        while(left <= right && top <= btm) {
            if(d == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                top++;
                d = 1;
            } else if(d == 1) {
                for (int i = top; i <= btm; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
                d = 2;
            } else if(d == 2) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[btm][i]);
                }
                btm--;
                d = 3;
            } else if (d == 3) {
                for (int i = btm; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
                d = 0;
            }
        }
        
        return list;
    }
    
    
}