// Leetcode 75: Sort Colors
// https://leetcode.com/problems/sort-colors/

package Arrays.Medium;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        
        System.out.println(Arrays.toString(arr));
    }

    private static void sortColors(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && key < arr[j]) {                
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
