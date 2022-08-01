//  Order Agnostic Binary Search Algorithm

package Binary_Search;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {100,88,55,33,22,20,10,9,6,3,2,1};
        int target = 6;
        System.out.println(agnosticBinary(arr, target));
    }

    static int agnosticBinary(int[] arr, int target) {
        int start = 0, end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {            
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
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
