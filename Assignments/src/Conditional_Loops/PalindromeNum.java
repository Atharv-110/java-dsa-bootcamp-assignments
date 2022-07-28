// Find if a number is palindrome or not

package Conditional_Loops;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt(), sum = 0, res = num;
        while (num>0) {            
            int rem = num % 10;
            sum  = sum * 10 + rem;
            num /= 10;
        }
        if (res == sum) {
            System.out.println("Number is Palindrome!");
        }
        else {
            System.out.println("Number is not palindrome");
        }    
    }
}