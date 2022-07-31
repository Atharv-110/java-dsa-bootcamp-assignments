// Binary Search algo

package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 7;
        int ans = binary_Search(arr, target);
        System.out.println(ans);
    }

    static int binary_Search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {            
            int middle = start + (end - start) / 2;
            if (target < arr[middle]) {
                end = middle - 1;
            }
            else if(target > arr[middle]){
                start = middle + 1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}
