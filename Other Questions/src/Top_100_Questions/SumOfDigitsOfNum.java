// Find the Sum of the Digits of a Number

package Top_100_Questions;

public class SumOfDigitsOfNum {
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }
    
//  Recursive Method
    private static int sumDigits(int num){
        if (num <= 1) {
            return 1;
        }
        int rem = num % 10;
        return rem + sumDigits(num/10);
    }
}
