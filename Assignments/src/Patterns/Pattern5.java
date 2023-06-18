// Assignments Pattern 5

package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    private static void pattern5(int n) {
        for(int row = 1; row <= 2*n-1; row++) {
            int totalColsInRow = row > n ? 2*n-row : row;
            for(int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
