// Write a program to print the factorial of a number by defining a method named 'Factorial'. 
package Functions;

import java.util.Scanner;

public class FactorialFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        System.out.println("Factorial : "+factorial(num));
    }

    static int factorial(int num) {
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }
        return fac;
    }
}
