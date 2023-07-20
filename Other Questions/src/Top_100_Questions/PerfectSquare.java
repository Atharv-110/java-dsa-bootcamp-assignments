// Check for Perfect Square

package Top_100_Questions;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(checkPerfectSquare(67));
    }
    
    private static boolean checkPerfectSquare(int num) {
        if (num >= 0) {
            int squareRoot = (int)(Math.sqrt(num));
            return squareRoot*squareRoot == num;
        }
        return false;
    }
}
