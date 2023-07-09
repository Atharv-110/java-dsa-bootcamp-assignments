// Program to find Sum of Digits in a number using recursion

package Recursion.EasyQuestions;

public class SumOfDigitsInNum {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12));
    }
    
    private static int sumOfDigits(int n) {
        if (n%10 == n) {
            return n;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
