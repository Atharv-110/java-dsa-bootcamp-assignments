// Create Target Array in the Given Order
// https://leetcode.com/problems/create-target-array-in-the-given-order/

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatArrayTarget {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] target = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, target)));
    }

    static int[] createTargetArray(int[] nums, int[] target) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(target[i],nums[i]);
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
