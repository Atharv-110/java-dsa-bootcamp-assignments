// Program to check if a number is power of 2 or not

package Bitwise_Operators;

public class CheckPowerOfTwo {
    public static void main(String[] args) {
        int num =16;
        System.out.println(checkPowerOf2(num));
    }

    private static boolean checkPowerOf2(int num) {
        if((num & (num-1)) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
