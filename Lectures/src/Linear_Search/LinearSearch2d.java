// Search for element in 2d array
package Linear_Search;

import java.util.Arrays;

public class LinearSearch2d {
    public static void main(String[] args) {
        int[][] arr = { {1,99,4},
                        {22,54,67,21},
                        {28,56,33}
                      };
        int target = 28;
        int[] ans = linear_Search_2d(arr,target);
        System.out.println("Element found at : "+Arrays.toString(ans));
    }

    static int[] linear_Search_2d(int[][] arr, int target) {
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
