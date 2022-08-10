// Search in Rotated Sorted Array
// https://leetcode.com/problems/search-in-rotated-sorted-array/

package Binary_Search_Questions;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        
//      below condition is if array is not rotated
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        else if (nums[pivot] == target) {
            return pivot;
        }
        else if(target > nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot+1, nums.length - 1);
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {            
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            else if (mid > start && nums[mid-1] > nums[mid]) {
                return mid - 1;
            }
            else if (nums[start] >= nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {            
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
