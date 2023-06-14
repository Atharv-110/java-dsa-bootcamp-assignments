// Leetcode 448 : Find all Numbers Disappeared in an Array
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

package Sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumsDisappeared {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = new ArrayList<>();
        list = findDisappearedNumbers(nums);
        System.out.println(list);
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i]-1; // range = 1 to n
            if (nums[i] != nums[correct]) {
                InsertionSort.swap(nums, i, correct);
            } else {
                i++;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int idx = 0; idx < nums.length; idx++) {
            if(nums[idx] != idx+1) {
                ans.add(idx+1);
            }
        }
        return ans;
    }
}
