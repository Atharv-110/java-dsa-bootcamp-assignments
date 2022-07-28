// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

package Conditional_Loops;

import java.util.Scanner;

public class SumNegPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int neg = 0, pos_even = 0, pos_odd = 0;
        while (true) {            
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            else {
                if (num < 0) {
                    neg += num;
                }
                else if (num > 0) {
                    if (num % 2 == 0) {
                        pos_even += num;
                    }
                    else {
                        pos_odd += num;
                    }
                }
            }
        }
        System.out.println("Sum of Negative Numbers : "+neg);
        System.out.println("Sum of Positive Even Numbers : "+pos_even);
        System.out.println("Sum of Positive Odd Numbers : "+pos_odd);
    }
}