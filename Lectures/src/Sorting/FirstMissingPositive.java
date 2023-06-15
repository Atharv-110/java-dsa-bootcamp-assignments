// Leetcode 41: First Missing Positive 
// https://leetcode.com/problems/first-missing-positive/

package Sorting;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,0,2};
        System.out.println(firstMissingPos(nums));
    }

    private static int firstMissingPos(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                InsertionSort.swap(nums, i, correct);
            } else{
                i++;
            }
        }
        for(int idx = 0; idx < nums.length; idx++) {
            if(nums[idx]!=idx+1) {
                return idx+1;
            }
        }
        return nums.length+1;
    }
}
