// Print 1 To N Without Loop (Recursion)

package Recursion.Easy;

public class OneToNWithoutLoop {
    public static void main(String[] args) {
        printSeq(10);
    }
    
    private static void printSeq(int n) {
        if (n == 0) {
            return;
        }
        printSeq(n-1);
        System.out.print(n + " ");
    }
}
