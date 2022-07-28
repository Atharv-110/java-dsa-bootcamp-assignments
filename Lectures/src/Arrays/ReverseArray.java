// Array Reversal
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr  = new int[5];
        System.out.println("Enter the elements for array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original array : "+Arrays.toString(arr));
        reverse(arr);
        System.out.println("reversed array : "+Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0, end = arr.length-1;
        while (start < end) {            
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}