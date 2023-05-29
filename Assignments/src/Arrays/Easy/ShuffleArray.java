// Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/

package Arrays;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        System.out.println(Arrays.toString(shuffleArr(nums,n)));
    }
    
    static int[] shuffleArr(int[] nums, int n) {
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[i*2] = nums[i];
        }
        for (int i = 1; i < n+1; i++) {
            ans[(i * 2) - 1] = nums[n + i - 1];
        }
        return ans;
    }
}
