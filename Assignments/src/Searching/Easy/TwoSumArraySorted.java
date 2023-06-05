// Leetcode 167: Two Sum II - Input Array is Sorted
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

package Searching.Easy;

import java.util.Arrays;

public class TwoSumArraySorted {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    private static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {            
            if (arr[start] + arr[end] == target) {
                return new int[] {start+1,end+1};
            }else if (arr[start] + arr[end] > target) {
                end--;
            }else {
                start++;
            }
        }
        return new int[]{};
    }
}
