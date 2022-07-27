// Calculate Batting Average

package Conditional_Loops;

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the runs scored and outs : ");
        int runs = sc.nextInt(), outs = sc.nextInt();
        float avg = runs / outs;
        System.out.println("Batting Average : "+avg);   
    }
}
