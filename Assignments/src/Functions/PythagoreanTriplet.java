// Write a function to check if a given triplet is a Pythagorean triplet or not.

package Functions;

import java.util.Arrays;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int[] arr = {15,17,8};
        boolean ans = checkTriplet(arr);
        if (ans) {
            System.out.println("Pythagorean Triplet");
        }
        else{
            System.out.println("Not Pythagorean Triplet");
        }
    }

    static boolean checkTriplet(int[] arr) {
        Arrays.sort(arr);
        return Math.pow(arr[arr.length-1],2) == Math.pow(arr[1],2) + Math.pow(arr[0], 2);
    }
}
