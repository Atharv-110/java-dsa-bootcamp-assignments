// Leetcode 268: Missing Number
// https://leetcode.com/problems/missing-number/

package Sorting;

public class MissinNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]) {
                InsertionSort.swap(nums, i, correct);
            } else {
                i++;
            }
        }
        
        for(int idx = 0; idx < nums.length; idx++) {
            if(nums[idx] != idx) {
                return idx;
            }
        }
        return nums.length;
    }
}
