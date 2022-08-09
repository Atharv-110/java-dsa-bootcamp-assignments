// Find in Mountain Array
// https://leetcode.com/problems/find-in-mountain-array/

package Binary_Search_Questions;

public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak, arr.length - 1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {            
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            else { 
                end = mid;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean check = arr[start] < arr[end];
        while (start <= end) {            
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if(check){
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
