// Reverse of String using Recursion
package Recursion.Easy;

import java.util.Arrays;

public class ReverseStringRecursion {

    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(Arrays.toString(arr));
        reverseStringRecursion(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void reverseStringRecursion(char[] charArr, int start, int end) {
        if (start > end) {
            return;
        }
        swap(charArr, start, end);

        reverseStringRecursion(charArr, start + 1, end - 1);
    }

    private static void swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
