// Take integer inputs till the user enters 0 and print the largest number from all.
package Conditional_Loops;

import java.util.Scanner;

public class LargestAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        while (true) {            
            System.out.print("Enter a num : ");
            int num = sc.nextInt();
            if (num==0) {
                break;
            }
            else {
                if (max < num) {
                    max = num;
                }
            }
        }
        System.out.println("Maximum : "+max);
    }
}