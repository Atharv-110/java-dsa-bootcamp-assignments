// Swapping Elements in Array
package Arrays;

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        int[] arr = {1 , 4, 88, 6, 4, 3, 4};
        System.out.println(Arrays.toString(arr));
        swapp(arr, 2, 6);
        System.out.println(Arrays.toString(arr));
        
    }

    static void swapp(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
