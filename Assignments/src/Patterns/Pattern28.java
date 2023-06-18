// Assignments Pattern 28

package Patterns;

public class Pattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }

    private static void pattern28(int n) {
        for(int row = 1; row <= 2*n; row++) {
            int totalColsInRow = row > n ? 2*n-row : row ;
            int spaces = n - totalColsInRow;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
