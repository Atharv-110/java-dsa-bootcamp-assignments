// WAP for Fibonacci Number using recursion

package Recursion.Easy;

public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    
    private static int fibo(int n) {
        if(n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
