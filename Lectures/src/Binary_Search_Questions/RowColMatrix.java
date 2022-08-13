// Matrix is sorted in a row and column wise manner

package Binary_Search_Questions;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search(arr, 38)));
    }
    static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr[0].length - 1;
        while (col >= 0 && row < arr.length) {            
            if (arr[row][col] == target) {
                return new int[]{row, col};
            }
            if (arr[row][col] > target) {
                col--;
            }
            if (arr[row][col] < target) {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
