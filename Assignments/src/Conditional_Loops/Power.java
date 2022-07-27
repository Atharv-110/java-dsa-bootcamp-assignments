// Power In Java

package Conditional_Loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 1;
        System.out.print("Enter the number and power to be calculated : ");
        int num = sc.nextInt(), pw = sc.nextInt();
        for (int i = 1; i <= pw; i++) {
            res *= num;
        }
        System.out.println("Result : "+res);
    }
}
