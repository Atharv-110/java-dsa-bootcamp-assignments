// Calculate Commission Percentage

package Conditional_Loops;

import java.util.Scanner;

public class CommissionPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price and commission amount : ");
        double price = sc.nextDouble(), comm = sc.nextDouble();
        double comm_percent = (comm * 100) / price;
        System.out.println("Commission Percent : " + comm_percent);
    }
}