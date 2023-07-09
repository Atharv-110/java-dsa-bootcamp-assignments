// Program to find factorial of a number using recursion
package Recursion.EasyQuestions;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
