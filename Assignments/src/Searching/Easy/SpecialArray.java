// Leetcode 1608: Special Array With X Elements Greater Than or Equal X
// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

package Searching.Easy;

public class SpecialArray {
    public static void main(String[] args) {
        int[] arr = {3,5};
        System.out.println(specArray(arr));
    }

    private static int specArray(int[] nums) {
        int start = 0;
        int end = nums.length;
        while(start <= end) {
            int mid = start + (end-start)/2;
            int count = 0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] >= mid) {
                    count++;
                }
            }
            if(count==mid) {
                return mid;
            } else if (count > mid) {
                start = mid+1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
