// Program to Find Product of digits in a number

package Recursion.EasyQuestions;

public class ProductOfDigitsInNum {
    public static void main(String[] args) {
        System.out.println(productOfDigits(550));
    }
    
//    n%10 = gives last digit in a number
//    n/10 = removes the last digit from the number
    
    private static int productOfDigits(int n) {
        if (n%10 == n) {
            return n;
        }
        
        return n%10 * productOfDigits(n/10);
    }
}
