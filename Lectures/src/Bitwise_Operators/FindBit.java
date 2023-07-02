// Program to Find ith Bit of a number
package Bitwise_Operators;

public class FindBit {
    public static void main(String[] args) {
        int num = 182;
        int n = 5;
        System.out.println(ithBit(num , n));
    }

    private static int ithBit(int num, int n) {
        return num & (1<<n-1);
    }
}
