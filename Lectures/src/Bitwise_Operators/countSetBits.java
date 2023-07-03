// Program to count set bits in a number

package Bitwise_Operators;

public class countSetBits {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(setBits(num));
    }

    private static int setBits(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num = num & (num-1);
        }
        return count;
    }
}
