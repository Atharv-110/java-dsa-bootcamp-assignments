// Sum Of N Numbers

package Conditional_Loops;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt(), sum = 0;
        int[] arr = new int[n];
        System.out.println("Enter the values in array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of "+n+" values is : "+sum);
    }
}