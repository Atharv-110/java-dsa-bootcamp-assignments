// Leetcode 350: Intersection of 2 Arrays II
// https://leetcode.com/problems/intersection-of-two-arrays-ii/

package Searching.Easy;

import java.util.ArrayList;
import java.util.Arrays;


public class IntersectionOfTwoArr2 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                i++;
            } else if(nums1[i] > nums2[j]) {
                j++;
            } else {
                arr.add(nums1[i]);
                i++; j++;
            }
        }
        int[] ans = new int[arr.size()];
        for (int k = 0; k < arr.size(); k++) {
            ans[k] = arr.get(k);
        }
        return ans;
    }
}
