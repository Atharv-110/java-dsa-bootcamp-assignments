// Minimum Element in an Array
package Linear_Search;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {111,66,3,6,7,1,2,5,4,9};
        int min = minimum(arr);
        System.out.println("Minimum Element : "+min);
    }

    static int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
