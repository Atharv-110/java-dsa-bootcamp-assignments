// Calculate Electricity Bill
package Conditional_Loops;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int energy_price = 9;
        System.out.print("Enter units Consumed for the month : ");
        int units = sc.nextInt();
        int bill_amt = units * energy_price;
        System.out.println("Your bill for the current month will be of : "+bill_amt);
    }
}