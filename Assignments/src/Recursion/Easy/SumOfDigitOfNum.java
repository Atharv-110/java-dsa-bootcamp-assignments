// WAP for Sum of digit of a number using recursion 
// https://www.geeksforgeeks.org/sum-digit-number-using-recursion/

package Recursion.Easy;

public class SumOfDigitOfNum {
    public static void main(String[] args) {
        int num = 1000;
        System.out.println(sumOfDigits(num));
    }
    
    private static int sumOfDigits(int num) {
        if(num == 0) {
            return 0;
        }
        int rem = num % 10;
        return rem + sumOfDigits(num/10);
    }
}
