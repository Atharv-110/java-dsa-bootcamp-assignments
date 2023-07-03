// Program for finding number of digits in a Binary Represented Number

package Bitwise_Operators;

public class NumOfDigitsInBinary {
    public static void main(String[] args) {
        int num = 10;
        int base = 2;
        
        int ans = (int)(Math.log(num)/Math.log(base)) + 1;
        
        System.out.println(ans);
    }
}
