// Program for 
// * * * *
// * * *
// * *
// *

package Recursion.Pattern_Basic_Sorting;

public class Triangle1 {
    public static void main(String[] args) {
        triangleOne(4, 0);
    }
    
    private static void triangleOne(int row, int col) {
        if(row == 0) {
            return;
        }
        
        if(col < row) {
            System.out.print("* ");
            triangleOne(row, col+1);
        } else {
            System.out.println();
            triangleOne(row-1, 0);
        }
    }
}
