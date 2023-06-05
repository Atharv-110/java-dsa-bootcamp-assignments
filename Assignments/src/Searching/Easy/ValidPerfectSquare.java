// Leetcode 367: Valid Perfect Square
// https://leetcode.com/problems/valid-perfect-square/
package Searching.Easy;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 81;
        System.out.println(isPerfectSquare(num));
    }

    private static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while (start <= end) {            
            long mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                start = (int)(mid+1);
            } else {
                end = (int)(mid-1);
            }
        }
        return false;
    }
}
