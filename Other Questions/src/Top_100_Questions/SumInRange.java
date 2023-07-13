// Find the Sum of the Numbers in a Given Interval
package Top_100_Questions;

public class SumInRange {
    public static void main(String[] args) {
        System.out.println(sumRangeIterative(1, 3));
        System.out.println(sumRangeRecursive(0, 1, 3));
    }
    
//  Iterative method
    private static int sumRangeIterative(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
    
//  Recursive Method
    private static int sumRangeRecursive(int sum, int start, int end) {
        if (start > end) {
            return sum;
        }
        return start + sumRangeRecursive(sum, start+1, end);
    }
}
