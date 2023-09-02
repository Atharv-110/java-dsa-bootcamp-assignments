// WAP for Binary Search using Recursion
package Recursion.Easy;

public class BinarySearchRecursion {

    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 0;
        System.out.println(search(arr, target));
    }

    private static int search(int[] arr, int target) {
        int ans = helperFunction(arr, target, 0, arr.length - 1);
        return ans;
    }

    private static int helperFunction(int[] arr, int target, int s, int e) {
        // Base condition
        // If start "s" becomes larger than end "e" that means there is no such target element in the array
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (target < arr[m]) {
            return helperFunction(arr, target, s, m - 1);
        } else if (target > arr[m]) {
            return helperFunction(arr, target, m + 1, e);
        } else {
            return m;
        }
    }
}
