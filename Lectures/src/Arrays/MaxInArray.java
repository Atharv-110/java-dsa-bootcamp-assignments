// Maximum Element in Array
package Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,5,77,3,55,22};
        System.out.println("Maximum element is : "+max_Element(arr));
    }

    static int max_Element(int[] arr) {
//        This will check whether the array is empty or not
        if (arr.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
