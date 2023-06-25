// Example binary Search using Recursion
package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,8,11,13};
        int start = 0, end = arr.length-1;
        int ans = Search(arr, 11, start, end);
        System.out.println(ans);
    }

    private static int Search(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == target) {
            return mid;
        }
        if(target < arr[mid]) {
            return Search(arr, target, start, mid-1);
        }
        return Search(arr, target, mid+1, end);
    }
}
