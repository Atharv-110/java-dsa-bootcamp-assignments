// Find the Fibonacci Series up to Nth Term

package Top_100_Questions;

public class FibonacciSeries {
    public static void main (String[] args) {
        printFibonacciSeries(15);
    }
    
//  This function prints all the fibonacci numbers till nth fibonacci number
    private static void printFibonacciSeries(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
        System.out.println();
    }

//  This function return the ith fibonacci number
    private static int fibo(int i) {
        if (i < 2) {
            return i;
        }
        return fibo(i-1) + fibo(i-2);
    }
}
