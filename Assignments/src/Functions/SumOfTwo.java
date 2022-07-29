// Write a program to print the sum of two numbers entered by user by defining your own method.
package Functions;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 Nums : ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Sum = "+sum(a,b));
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
