// Search in Rotated Sorted Array
// https://leetcode.com/problems/search-in-rotated-sorted-array/

package Binary_Search_Questions;

public class SearchInRotatedArray {
    public static void main(String[] args) {
//        int[] nums = {6,7,3,4,5,5,6};
//        int target = 0;
//        System.out.println(search(nums, target));
//        System.out.println(findPivotWithDuplicates(nums));
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
    
    static int findPivotWithDuplicates(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {            
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (start > end && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
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
