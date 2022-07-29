// Write a function that returns the sum of first n natural numbers.
package Functions;

import java.util.Scanner;

public class SumNaturals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Sum = "+sumNat(n));
    }

    static int sumNat(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
