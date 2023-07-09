// To print 1 to n and vice versa using recursion

package Recursion.EasyQuestions;

public class OneToN {
    public static void main(String[] args) {
//        rangePrint(5);
        rangePrintReverse(5);
    }
    
    private static void rangePrint(int n) {
        if(n == 0) {
            return;
        }
        rangePrint(n-1);
        System.out.println(n);
    }
    
    private static void rangePrintReverse(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        rangePrintReverse(n-1);
    }
}
