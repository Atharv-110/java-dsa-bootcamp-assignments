// Number of Good Pairs
// https://leetcode.com/problems/number-of-good-pairs/

package Arrays;

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    static int numIdenticalPairs(int[] nums) {
        int counts = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counts++;
                }
            }
        }
        return counts;
    }
}
