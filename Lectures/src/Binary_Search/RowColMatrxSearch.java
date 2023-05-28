// Matrix is sorted in a row and column wise manner

package Binary_Search;

import java.util.Arrays;

public class RowColMatrxSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        
        int target = 37;
        System.out.println(Arrays.toString(matrixSearch(arr,target)));
    }
    
    private static int[] matrixSearch(int[][] arr, int target) {
        int row = 0;
        int col = arr.length-1;
        while (row < arr.length && col >= 0) {            
            if (target == arr[row][col]) {
                return new int[]{row,col};
            }
            else if (target > arr[row][col]) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
