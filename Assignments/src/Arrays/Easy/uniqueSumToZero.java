// Find N unique integers sum upto zero
// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

package Arrays;

import java.util.Arrays;

public class uniqueSumToZero {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    private static int[] sumZero(int n) {
        int[] arr = new int[n];
//      Even case
        if(n % 2 == 0) {
            for (int i = 1; i < n; i=i+2) {
                arr[i-1] = i;
                arr[i] = -i;
            }
        }
//      Odd Case
        else {
            for (int i = 0; i < n-1; i=i+2) {
                arr[i] = i + 1;
                arr[i+1] = -(i+1);
            }
            arr[n-1] = 0;
        }
        
        return arr;
    }
}
