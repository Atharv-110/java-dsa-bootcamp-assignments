// Input a number and print all the factors of that number (use loops).

package Conditional_Loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        System.out.println("Factors : ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + "\t");
            }
        }
    }
}
