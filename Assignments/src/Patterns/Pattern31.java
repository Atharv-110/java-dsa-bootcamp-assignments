// Assignments Pattern 31

package Patterns;

public class Pattern31 {
    public static void main(String[] args) {
        pattern31(4);
    }

    private static void pattern31(int n) {
        int rows = n;
        n = 2 * n;
        for (int row = 1; row <= n-1; row++) {
            for (int col = 1; col <= n-1; col++) {
                int atEveryIdx = rows - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIdx+" ");
            }
            System.out.println();
        }
    }
}
