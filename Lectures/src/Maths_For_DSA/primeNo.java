// Check if the give number is prime or not

package Maths_For_DSA;

public class primeNo {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        int i = 2;
        while(i * i <= n) {
            if(n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
