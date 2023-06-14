// Leetcode 287: Find the Duplicate Number
// https://leetcode.com/problems/find-the-duplicate-number/

package Sorting;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }

    private static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if (nums[i] != i+1) {
                int correct = nums[i] - 1; // Range is given from 1 to n
                if(nums[i] != nums[correct]) {
                    InsertionSort.swap(nums, i, correct);
                } else {
                    return nums[i]; 
// If it passed first if statement and failed in second if it means that no. is already there in the array and it is swapped with its correct position so return that value
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}
