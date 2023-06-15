// Leetcode 645: Set Mismatch
// https://leetcode.com/problems/set-mismatch/

package Sorting;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    private static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i]-1; // range is given from 1 to n
            if(nums[i]!=nums[correct]) {
                InsertionSort.swap(nums, i, correct);
            } else  {
                i++;
            }
        }
        
        for(int idx = 0; idx < nums.length; idx++) {
            if (nums[idx]!= idx+1) {
                return new int[] {nums[idx], idx+1};
            }
        }
        return new int[]{-1,-1};
    }
}
