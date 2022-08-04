// Ceiling of a Number in Array

package Binary_Search_Questions;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 19;
        System.out.println(ceiling_ind(arr, target));
    }

    static int ceiling_ind(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0, end = arr.length - 1;
        while (start <= end) {            
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }
    
}
