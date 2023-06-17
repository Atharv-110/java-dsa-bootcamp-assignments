// Leetcode 1346: Check If N & its Double Exists
// https://leetcode.com/problems/check-if-n-and-its-double-exist/

package Searching.Easy;

import java.util.Arrays;

public class ChechIfNdDoubleExist {
    public static void main(String[] args) {
        int[] nums = {10,2,5,3};
        System.out.println(checkIfExists(nums));
    }

    private static boolean checkIfExists(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];
            int start = 0, end = arr.length-1;
            while(start <= end) {
                int mid = start + (end-start)/2;
                if(arr[mid]==target && mid!=i) {
                    return true;
                } else if (target > arr[mid]) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return false;
    }
}
