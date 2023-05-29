// Two Sum
// https://leetcode.com/problems/two-sum/
package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
//      Bruteforce Approach
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] + nums[j] == target) {
//                    ans[0] = i;
//                    ans[1] = j;
//                    break;
//                }
//            }
//        }
//      Optimised Approach
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                break;
            }
            else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
