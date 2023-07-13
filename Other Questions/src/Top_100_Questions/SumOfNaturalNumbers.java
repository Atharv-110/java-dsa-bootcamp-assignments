// Program to sum the n natural numbers

package Top_100_Questions;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumIterative(5));
        System.err.println(sumRecursive(5));
    }
    
    private static int sumIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    private static int sumRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumRecursive(n-1);
    }
}
