// Find the nth Magic Number 

package Bitwise_Operators;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 4;
        int ans = 0, base = 5;
        while(n > 0) {
            int last = n & 1;
            n >>= 1;
            ans += last * base;
            base *= 5;
        }
        System.out.println(ans);
    }
}
