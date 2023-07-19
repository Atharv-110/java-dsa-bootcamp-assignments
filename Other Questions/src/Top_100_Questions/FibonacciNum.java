// Find the nth fibonacci number

package Top_100_Questions;

public class FibonacciNum {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    
    private static int fibo(int num) {
        if (num < 2) {
            return num;
        }
        return fibo(num-1) + fibo(num-2);
    }
}
