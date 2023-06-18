// Assignments pattern 17

package Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        pattern17(4);
    }

    private static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int c = row > n ? 2*n-row : row ;
            for (int s = 1; s <= n-c; s++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
}

