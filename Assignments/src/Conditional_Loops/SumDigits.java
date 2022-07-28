// Sum Of A Digits Of Number

package Conditional_Loops;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n>0) {            
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        System.out.println("Sum of Digits : "+sum);
    }
}
