// ODD/EVEN Program using Bitwise Operators

package Bitwise_Operators;

public class OddEvenBitwise {
    public static void main(String[] args) {
        int num = 22;
        System.out.println(oddEven(num));
    }

    private static boolean oddEven(int num) {
        return (num & 1)==1;
    }
}
