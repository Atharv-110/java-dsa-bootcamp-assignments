// Concatenation of Array
// https://leetcode.com/problems/concatenation-of-array/
package Arrays;

import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int p = 0;
        for (int num : nums) {
            ans[p] = num;
            p++;
        }
        for (int num : nums) {
            ans[p] = num;
            p++;
        }
        return ans;
    }
}
