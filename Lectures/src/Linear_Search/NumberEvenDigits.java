// Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

package Linear_Search;

public class NumberEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println("Numbers with even number of digits : "+findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numDigits = digits(num);
        return numDigits % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num *= -1;
        }
        return (int)(Math.log10(num))+1;
    }
    
}
