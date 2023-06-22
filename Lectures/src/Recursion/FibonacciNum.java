// Example Fibonacci Number
//

package Recursion;

public class FibonacciNum {
    public static void main(String[] args) {
        int ans = fibo(7);
        System.out.println(ans);
    }

    private static int fibo(int n) {
        if(n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
