// Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/

package Arrays;

import java.util.Arrays;

public class RunningSum1D {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    private static int[] runningSum(int[] nums) {
        int[] r = new int[nums.length];
        r[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
            r[i] = nums[i];
        }
        return r;
    }
}
