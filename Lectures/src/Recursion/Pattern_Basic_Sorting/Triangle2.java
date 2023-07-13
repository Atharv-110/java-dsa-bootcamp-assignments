// Program for
// *
// * *
// * * *
// * * * *

package Recursion.Pattern_Basic_Sorting;

public class Triangle2 {
    public static void main(String[] args) {
        triangleTwo(4, 0);
    }
    
    private static void triangleTwo(int row, int col) {
        if(row == 0) {
            return;
        }
        if(col < row) {
            triangleTwo(row, col+1);
            System.out.print("* ");
        } else {
            triangleTwo(row-1, 0);
            System.out.println();
        }
    }
}
