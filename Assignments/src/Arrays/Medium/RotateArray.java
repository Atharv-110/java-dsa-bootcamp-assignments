// Leetcode 189: Rotate Array
// https://leetcode.com/problems/rotate-array/

package Arrays.Medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int k) {
        k %= arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
    }

    private static void reverse(int[] arr, int s, int e) {
        int temp = 0;
        while (s < e) {            
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++; e--;
        }
    }
}
