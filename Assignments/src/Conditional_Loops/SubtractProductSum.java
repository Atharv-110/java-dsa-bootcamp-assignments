// Subtract the Product and Sum of Digits of an Integer
package Conditional_Loops;

import java.util.Scanner;

public class SubtractProductSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int num = sc.nextInt();
        int sum = 0, pro = 1,rem = 0, sub = 0;
        while (num > 0) {            
            rem = num % 10;
            sum += rem;
            pro *= rem;
            num /= 10;
        }
        sub = pro - sum;
        System.out.println("Answer : "+sub);
    }
}
