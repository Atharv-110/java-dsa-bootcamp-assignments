// Check whether given number is palindrome or not (121 = 121)
package Recursion.EasyQuestions;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(check(1211));
    }
    
    private static boolean check(int n) {
        return n == reverse(n);
    }

    private static int reverse(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helperFun(n, digits);
    }

    private static int helperFun(int n, int digits) {
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits-1)) + helperFun(n/10, digits-1);
    }
}
