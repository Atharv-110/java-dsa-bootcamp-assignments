// Search element using Rotated Binary Search using Recursion

package Recursion.ArrayQuestions;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(rotatedSearch(arr, 3, 0, arr.length - 1));
    }

    private static int rotatedSearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        
        int m = s + (e-s)/2;
        if (arr[m] == target) {
            return m;
        }
        
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return rotatedSearch(arr, target, s, m-1);
            } else {
                return rotatedSearch(arr, target, m+1, e);
            }
        }
        
        if (target >= arr[m] && arr[m] <= arr[e]) {
            return rotatedSearch(arr, target, m+1, e);
        } else {
            return rotatedSearch(arr, target, s, m-1);
        }
    }
}
