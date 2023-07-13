// Check if a number is positive or negative

package Top_100_Questions;

public class PositiveNegative {
    public static void main(String[] args) {
        check(10);
    }
    
    private static void check(int n) {
        if (n < 0) {
            System.out.println(n + " is negative");
        } else if (n == 0) {
            System.out.println(n + " is zero");
        } else {
            System.out.println(n + " is positve");
        }
    }
}
