// Calculate Average Of N Numbers

package Conditional_Loops;

import java.util.Scanner;

public class AverageNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+(i+1)+" num : ");
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("Average = "+ (sum / n));
    }
}
