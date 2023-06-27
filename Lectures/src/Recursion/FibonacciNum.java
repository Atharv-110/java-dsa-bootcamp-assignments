// Example Fibonacci Number
//

package Recursion;

public class FibonacciNum {
    public static void main(String[] args) {
        int ans = fiboFormula(6);
        System.out.println(ans);
    }

    private static int fibo(int n) {
        if(n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    private static int fiboFormula(int n) {
        return (int)((Math.pow(((1 + Math.sqrt(5))/2),n) - (Math.pow(((1 - Math.sqrt(5))/2), n))) / Math.sqrt(5));
    }
}
