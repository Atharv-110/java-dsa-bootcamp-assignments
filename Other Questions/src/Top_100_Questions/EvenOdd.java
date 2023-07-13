// Check whether number is even or odd

package Top_100_Questions;

public class EvenOdd {
    public static void main(String[] args) {
        check(10);
        checkBitwise(10);
        
    }
    
//  if-else brute force approach
    private static void check(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
    
//  using Bitwise Operators
    private static void checkBitwise(int n) {
        if ((n&1) == 1) {
            System.out.println(n + " is odd");
        } else {
            System.out.println(n + " is even");
        }
    }
}
