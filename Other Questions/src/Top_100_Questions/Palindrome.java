// Check Whether or Not the Number is a Palindrome

package Top_100_Questions;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1212));
    }

//  Recursive method
    private static boolean isPalindrome(int num) {
        int reverse = helper(num, 0);
        return num == reverse;
    }

    private static int helper(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        int rem = num % 10;
        rev = rev * 10 + rem;
        return helper(num/10, rev);
    }
}
