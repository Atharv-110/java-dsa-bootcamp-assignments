// Leetcode 35: Search Insert Position
// https://leetcode.com/problems/search-insert-position/

package Leetcode;

public class SearchInsertPos {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(arr,target));
    }

    private static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        
        while (start <= end) {            
            int mid = start + (end-start)/2;
            if (target==arr[mid]) {
                return mid;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }
 
}
