// Leetcode 1539: Kth Missing Positive Number
// https://leetcode.com/problems/kth-missing-positive-number/

package Searching.Easy;

public class KthMissingPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    private static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length;
        while (start < end) {            
            int mid = start + (end - start) / 2;
            if (arr[mid] - (mid + 1) < k) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start + k;
    }
}
