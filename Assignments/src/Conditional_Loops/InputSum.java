// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

package Conditional_Loops;

import java.util.Scanner;

public class InputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {            
            System.out.print("Enter a no. : ");
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            else{
                sum += num;
            }
        }
        System.out.println("Final Sum = "+sum);
    }
}